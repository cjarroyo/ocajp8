package ch1.ch1.java_buildings_blocks.C_understanding_package_declarations_and_imports;

/*
 * Created by: Cristian Arroyo
 * on 07 May 2018 - 6:12 PM
 */

public class B_RedundantImports {
    /*
        Wait a minute! We’ve been referring to System without an import and Java found it just fine.
        There’s one special package in the Java world called java.lang.
        This package is special in that it is automatically imported.

        import java.lang.System; (redundant)
        import java.lang.*; (redundant)
        import java.util.Random;
        import java.util.*; (redundant)
        public class ImportExample {
            public static void main(String[] args) {
                Random r = new Random();
                System.out.println(r.nextInt(10));
            }
        }

        Now let’s consider some imports that don’t work:

            import java.nio.*;  // NO GOOD – a wildcard only matches class names, not "file.*Files"

            import java.nio.*.*; // NO GOOD – you can only have one wildcard and it must be at the end

            import java.nio.files.Paths.*; // NO GOOD – you cannot import methods only class names
     */
}
