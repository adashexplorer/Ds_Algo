module Ds.Algo {
    /**
     * The module-info.java file is used in Java's module system (introduced in Java 9) to define a module.
     * It specifies the module's name and can declare dependencies on other modules, export packages, or open packages for reflection.
     */
}

/**
 *  Real life scenario -
 *  A module-info.java file is useful in large applications to enforce strong encapsulation and manage dependencies between modules. Here's a real-world example:  Suppose you are building a library management system with the following modules:
 *    1. Library.Core - Contains core functionality like book and user management.
 *    2. Library.UI - Provides a user interface for the library system.
 *    3. Library.Database - Handles database operations.
 *
 *  Each can be considered a module or independent microservice.
 *
 *  Example module-info.java for Library.Core:
 *      module Library.Core {
 *          exports com.library.core.models;
 *          exports com.library.core.services;
 *      }
 *      This module exports its models and services for other modules to use.
 *
 *  Example module-info.java for Library.UI:
 *      module Library.UI {
 *          requires Library.Core;
 *      }
 *      This module requires Library.Core to access its exported packages.
 *
 *  Example module-info.java for Library.Database:
 *     module Library.Database {
 *           requires Library.Core;
 *           exports com.library.database;
 *     }
 *     This module depends on Library.Core and exports its database-related functionality.
 *
 *  Benefits:
 *    - Encapsulation: Only the specified packages are accessible to other modules.
 *    - Dependency Management: Ensures that modules explicitly declare their dependencies.
 *    - Compile-Time Safety: Detects missing or unused dependencies at compile time.
 *
 *
 *  Common issues and solutions:
 *     1. Circular dependencies: Avoid circular dependencies by refactoring code to break the cycle.
 *     2. Missing dependencies: Ensure all required modules are included in the module path.
 *     3. Access issues: Check the module-info.java files to ensure the correct packages are exported and required.
 *     4. Versioning: Use semantic versioning to manage module versions and dependencies.
 *     5. Compatibility: Ensure that modules are compatible with each other by testing them together.
 *     6. Performance: Monitor the performance of modules to identify any bottlenecks or inefficiencies.
 *     7. Documentation: Keep module-info.java files well-documented to help developers understand the module structure and dependencies.
 *
 */


/**
 *    Cyclic Dependency issue -
 *       A cyclic dependency occurs when two or more modules depend on each other, creating a loop. This can lead to issues during compilation and runtime.
 *       Example -
 *          module-info.java for Module A:
 *             module ModuleA {
 *                requires ModuleB;
 *             }
 *
 *          module-info.java for Module B:
 *             module ModuleB {
 *                requires ModuleA;
 *             }
 *
 *       Why this happens -
 *          Cyclic dependencies can occur due to poor design, where modules are tightly coupled or share common functionality. This can lead to confusion and make it difficult to maintain the codebase.
 *          Here, moduleA requires moduleB and moduleB requires moduleA, creating a cycle. Java module system does not allow cyclic dependencies between modules and this will result in compilation error.
 */