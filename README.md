# Sistema de Gestión de Productos

## 📋 Descripción

Este proyecto es una aplicación Java simple que demuestra el uso de Programación Orientada a Objetos (POO) mediante la implementación de un sistema básico de gestión de productos. El proyecto incluye una clase `Product` que encapsula la información de productos y una clase `Main` que demuestra su uso.

## 🎯 Objetivos del Proyecto

- Implementar una clase Java con atributos privados y encapsulamiento
- Utilizar constructores parametrizados y por defecto
- Aplicar getters y setters con validación de datos
- Sobrescribir el método `toString()` para representación legible de objetos
- Demostrar la creación y manipulación de objetos

## 🏗️ Estructura del Proyecto

```
actividad1/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── Main.java       # Clase principal
│   │   │           └── Product.java    # Clase modelo
│   │   └── resources/
│   └── test/
│       └── java/
└── target/
```

## 📦 Clase Product

### Atributos
- `id` (String): Identificador único del producto
- `name` (String): Nombre del producto
- `price` (double): Precio del producto
- `stock` (int): Cantidad disponible en inventario

### Constructores
- **Constructor parametrizado**: `Product(String id, String name, double price, int stock)`
- **Constructor por defecto**: `Product()` - Inicializa con valores predeterminados ("null", "null", 0.0, 0)

### Métodos
- **Getters**: `getId()`, `getName()`, `getPrice()`, `getStock()`
- **Setters**: `setName()`, `setPrice()`, `setStock()`
  - ⚠️ **Validaciones**: Los setters de `price` y `stock` validan que no se ingresen valores negativos
- **toString()**: Retorna una representación formateada del producto

### Validaciones Implementadas
- Si el precio es negativo, se establece automáticamente en 0.0
- Si el stock es negativo, se establece automáticamente en 0

## 🚀 Funcionalidad de Main

La clase `Main` demuestra las siguientes operaciones:

1. **Creación de productos** con el constructor parametrizado
2. **Actualización de precio** usando `setPrice()`
3. **Actualización de stock** usando `setStock()`
4. **Actualización de nombre** usando `setName()`
5. **Creación de producto vacío** con constructor por defecto
6. **Visualización de información** mediante `toString()`

### Ejemplo de Salida

```
Creando productos...
-------------------
Producto 1:
Precio actualizado de producto1: 1050.0
Producto 2:
Stock actualizado de producto2: 25
Producto 3:
Nombre actualizado de producto3: Tablet Pro
Producto 4:
Producto4 - ID: null, Name: null, Price: 0.0, Stock: 0

Detalles de los productos:
Producto: 
ID: 001
Nombre: Laptop
Precio: 1050.0
Stock: 10

Producto: 
ID: 002
Nombre: Smartphone
Precio: 499.99
Stock: 25

Producto: 
ID: 003
Nombre: Tablet Pro
Precio: 299.99
Stock: 15

Producto: 
ID: null
Nombre: null
Precio: 0.0
Stock: 0
```

## 🛠️ Requisitos

- Java JDK 8 o superior
- Maven (para gestión de dependencias)

## ▶️ Cómo Ejecutar

### Usando Maven

```bash
# Compilar el proyecto
mvn compile

# Ejecutar la aplicación
mvn exec:java -Dexec.mainClass="com.example.Main"
```

### Usando Java directamente

```bash
# Compilar
javac -d target/classes src/main/java/com/example/*.java

# Ejecutar
java -cp target/classes com.example.Main
```

## 💡 Conceptos de POO Aplicados

- **Encapsulamiento**: Atributos privados con acceso controlado mediante getters/setters
- **Constructores**: Diferentes formas de inicializar objetos
- **Validación de datos**: Control de valores en setters
- **Sobrescritura de métodos**: Implementación personalizada de `toString()`
- **Inmutabilidad parcial**: El ID solo puede establecerse en el constructor

## 📝 Autor

Proyecto desarrollado como parte de Actividad 1

## 📅 Fecha

Febrero 2026
