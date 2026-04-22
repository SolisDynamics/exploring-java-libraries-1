# 📚 Detailed Chapter Index: Volume I

This index provides a comprehensive roadmap of the topics covered in **Exploring Java Libraries: Volume I**. It is structured to help you navigate through the foundational, structural, and data-handling APIs of the core Java ecosystem.

---

## 🗺️ Table of Contents Overview

| Section | Topic | Page Range |
| :--- | :--- | :--- |
| **1** | [Lang Package (Core Runtime & Exceptions)](#1-lang-package) | 1 - 152 |
| **2** | [Util Package (Collections & Data Structures)](#2-util-package) | 153 - 350 |
| **3** | [IO Package (Streams & Serialization)](#3-io-package) | 351 - 496 |
| **4** | [NIO Package (Non-blocking File Systems)](#4-nio-package) | 497 - 530 |
| **-** | [NIO Specialized Sub-packages](#nio-specialized-packages) | 531 - 718+ |

---

## 1. Lang Package
> **Focus:** The foundation of Java. Memory management, fundamental data types, system operations, and core error handling.

* **A. Classes** (Page 3)
  * 🔹 **Core Structural & Numeric Wrappers:** Object behaviors and primitive wrappers (Page 10).
  * 🔹 **String and Text Processing:** Immutable and mutable text operations (Page 18).
  * 🔹 **System and Process Management:** Runtime, threads, and garbage collection (Page 32).
  * 🔹 **Reflection and Class Management:** Dynamic runtime inspection (Page 44).
  * 🔹 **Mathematical Classes:** High-precision operations (Page 50).
  * 🔹 **Security & Auxiliary Classes:** Advanced platform interactions (Page 58).
* **B. Interfaces** (Page 63)
  * 🔹 Core Functional, Data Processing, and Special Purpose Interfaces.
* **C. Enum Classes** (Page 73)
* **D. Exceptions** (Page 79)
  * 🔹 Fundamental, System, Security, and Type Conversion Exceptions (Page 104).
* **E. Errors** (Page 111)
  * 🔹 System, Loading, Runtime, Access, and Initialization Errors (Page 135).
* **F. Annotation Interfaces** (Page 143)
  * 🔹 Most Critical Annotations (e.g., `@Override`, `@Deprecated`).

---

## 2. Util Package
> **Focus:** High-performance data structures, the Collections Framework, time APIs, and essential utility components.

* **A. Interfaces** (Page 157)
  * 🔹 **Collection & Map Hierarchies:** The blueprints of data structures (Page 206).
  * 🔹 **Sorting & Navigation:** Comparators and ordered traversal (Page 175).
  * 🔹 **Iteration:** Standard and primitive iterators (Page 190).
* **B. Classes** (Page 223)
  * 🔹 **Basic & Infrastructure Collections:** Lists, Sets, Maps, and their implementations (Page 255).
  * 🔹 **Utility Classes:** Arrays, Collections, and general helpers (Page 271).
  * 🔹 **Resource & Localization Classes:** Multi-region support architectures (Page 289).
  * 🔹 **Date and Time Classes:** Legacy and transitional temporal handling (Page 297).
  * 🔹 **Formatting & Event Listeners:** Data conversion and observer patterns (Page 319).
* **C. Enum Classes** (Page 327)
* **D. Exceptions** (Page 336)
  * 🔹 Critical Collection, Structural, and Input/System Exceptions (Page 347).

---

## 3. IO Package
> **Focus:** High-throughput data transfer, stream buffering, file system interactions, and object serialization.

* **A. Interfaces** (Page 354)
  * 🔹 Data Streams, Serialization, Filtering, and Resource Management.
* **B. Classes** (Page 373)
  * 🔹 **Byte Streams:** Basic, File, Filter, Array, and Piped data flows (Page 396).
  * 🔹 **Character Streams:** Readers/Writers for standard and file-based text (Page 400).
  * 🔹 **Conversion Streams:** Bridging bytes and characters (Page 428).
  * 🔹 **Object Serialization Classes:** Persisting object state (Page 433).
  * 🔹 **Utility & String-Based Streams:** Advanced I/O manipulation (Page 440).
* **C. Enum Classes** (Page 486)
* **D. Exception Classes** (Page 470)
  * 🔹 Basic I/O, File Access, Serialization, and Data Format Exceptions (Page 488)
* **E. Annotation Interfaces** (Page 493)

---

## 4. NIO Package
> **Focus:** Modern, highly scalable, and non-blocking I/O operations utilizing buffers and channels.

* **A. Classes** (Page 502)
  * 🔹 Core Buffer allocations and system-level I/O basics.

---

### NIO Specialized Packages

#### 📁 NIO File Package (`java.nio.file`) (Page 531)
* **A. Interfaces:** File System Core, Operations, and Watch Service events.
* **B. Classes:** File System implementations, Traversal, and Watching Events (Page 556).
* **C. Enum Classes:** Primary File Operations and Access/Event enums (Page 583)
* **D. Exception Classes:** File system, path, and resource exceptions (Page 595)

#### ⚙️ NIO File SPI Package (`java.nio.file.spi`) (Page 627)
* **A. Classes:** Service Provider Interfaces for custom file systems.

#### ⚡ NIO Channels Package (`java.nio.channels`) (Page 633)
* **A. Interfaces:** Asynchronous Communication and Completion triggers.
* **B. Classes:** Main Channels, Async Channels, Pipes, and Selection Keys (Page 649).
* **C. Exception Classes:** Channel-specific runtime exceptions (Page 698).

#### 🔡 NIO Charset Package (`java.nio.charset`) (Page 718)
* **A. Classes:** Advanced encoding, decoding, and character mapping.

---

## 📌 How to Use This Index

- Start with `java.lang` to understand the runtime foundation  
- Move to `java.util` for data structures and utilities  
- Continue with `java.io` for stream-based I/O  
- Master `java.nio` for scalable and high-performance systems

---

> [!TIP]
> **Volume I** builds the **backend and runtime foundation of Java**.  
> **Volume II** extends this into **GUI, rendering, and accessibility systems**.  
> Together, they form a **complete, production-ready Java knowledge system**.

---

[↑ Back to Top](#-detailed-chapter-index-volume-i)
