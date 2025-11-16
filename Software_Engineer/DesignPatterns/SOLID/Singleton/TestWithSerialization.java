package Software_Engineer.DesignPatterns.SOLID.Singleton;

import java.io.*;

class SerializableSingleton implements Serializable {
    private static final SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return instance;
    }

    // Yeh magic method hai
    protected Object readResolve() {
        return instance;  // Hamesha same instance wapas dega
    }
}

public class TestWithSerialization {
    public static void main(String[] args) throws Exception {
        SerializableSingleton s1 = SerializableSingleton.getInstance();

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        oos.writeObject(s1);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializableSingleton s2 = (SerializableSingleton) ois.readObject();
        ois.close();

        // Compare dono object
        System.out.println(s1 == s2);  // ✅ Output: true
    }
}

// if I change the name of readResolve to readResolve1 and run the code again, then the output will be false because the singleton property is violated during deserialization.
// Output: false
// This shows the importance of the readResolve method in maintaining the singleton property during serialization and deserialization.
// so the read resolve merhod is default method which is called during deserialization to ensure that the singleton property is maintained.
// Without this method, deserialization would create a new instance of the singleton class, violating the singleton pattern.
// but i can not see that method is called anywhere but still it is working.
// Yes, the readResolve method is not explicitly called in your code, but it is invoked by the Java serialization mechanism during the deserialization process.
// When you deserialize an object, Java checks if the class has a readResolve method. If
// it does, Java calls this method to determine the object that should be returned as the result of deserialization.
// This is how the singleton property is preserved even after serialization and deserialization.
// So, even though you don't see a direct call to readResolve in your code, it is automatically called by the Java serialization framework when you deserialize the object.
// without readResolve method
// If you remove the readResolve method from the SerializableSingleton class and run the serialization and deserialization code again, you will see that the output will be false.
// This is because, without the readResolve method, the deserialization process creates a new instance of the SerializableSingleton class.
// As a result, s1 and s2 will refer to different instances, violating the singleton property.
// So, the readResolve method is crucial for maintaining the singleton property during serialization and deserialization.