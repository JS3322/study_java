/**
 * @Process: init
 * @Project_Name: module
 * @Package_Name: embeddedlibrary
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: DemoApplication.java
 * @Version : v11.0.12
 * @contents: -
 */

package embeddedlibrary;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import java.io.File;*/
//import com.sun.jna.*;

//@SpringBootApplication
public class DemoApplication {

    /*	public static native void hello();*/

/*	native void hello();

	// Loading library
	static {
		System.loadLibrary("lib/libinit_test.dylib");
	}*/

    public static void main(String[] args) {
/*
        RustLibrary.INSTANCE.hello();
        //RustLibrary.INSTANCE.hello_check();
        RustLibrary.INSTANCE.sys_out();
        System.out.println();
        RustLibrary.INSTANCE.add(33, 23);
        int acd = RustLibrary.INSTANCE.add_int(51, 23);
        System.out.println(acd);

        RustLibrary.hello_check();

		File f = new File("lib/libinit_test.dylib");
		System.load(f.getAbsolutePath());
		System.out.println(f);
		DemoApplication.hello();
		SpringApplication.run(DemoApplication.class, args);
 */
    }
/*
    interface RustLibrary extends Library {
        RustLibrary INSTANCE = (RustLibrary) Native.loadLibrary(
                ("lib/libinit_test.dylib"), RustLibrary.class);
        void hello();


        static void hello_check() {
            System.out.println("out");
        }

        void add(int a, int b);
        int add_int(int a, int b);
        //		void array_output(11, 22, 33, 42, 12, 42);
        void sys_out();
    }
*/
}

