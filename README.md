# Manual de Usuario - Sistema de Gestión laboratorio2jbran

## Requisitos para ejecutar el sistema
- Java JDK 25 o superior
- Apache NetBeans IDE
- Clonar el repositorio y hacer **Clean and Build** antes de correr

---

## Usuarios del sistema

| Usuario | Contraseña | Rol |
|---------|-----------|-----|
| Jbran | Umariano24 | Administrador |
| Dgarcia | Umariano24 | Usuario Normal |

---

## 1. Login

Al iniciar el sistema se muestra la pantalla de login.

- Ingresar **usuario** y **contraseña**
- Presionar el botón **"Ingresar"**
- Si las credenciales son correctas se abrirá el **Menú Principal**
- Si son incorrectas se mostrará un mensaje de error

> **Nota:** Si se falla 3 veces seguidas, el sistema se bloqueará y mostrará el mensaje:
> *"Ha fallado varias veces, por favor comuníquese con su administrador"*

---

## 2. Menú Principal

Desde el Menú Principal se puede acceder a las siguientes opciones:

| Opción | Disponible para |
|--------|----------------|
| Usuarios | Todos |
| Restablecer Contraseña | Solo Administrador |

> Los usuarios normales **solo tienen acceso a visualizar los usarios registrados**.

---

## 3. Gestión de Usuarios *(Todos)*

Para acceder: **Menú Principal → Usuarios**

### 3.1 Crear Usuario *(Solo administradores)*
1. Presionar el botón **"Crear Usuario"**
2. Completar los campos:
   - **Nombre**
   - **Email**
   - **Usuario**
   - **Contraseña** *(mínimo 13 caracteres, 1 mayúscula y 1 signo especial)*
   - **Confirmar Contraseña**
   - Marcar **"¿Es Administrador?"** si aplica
3. Presionar **"Crear Usuario"**

### 3.2 Listar Usuarios *(Todos)*
- Al abrir la ventana de Usuarios se muestra automáticamente la tabla con todos los usuarios activos
- Columnas: **Nombre, Email, Usuario**

### 3.3 Desactivar Usuario *(Solo administradores)*
1. Seleccionar un usuario de la tabla haciendo click sobre él
2. Presionar el botón **"Eliminar Usuario"**
3. Confirmar la acción en el mensaje **"¿Estás seguro?"**
4. El usuario quedará desactivado y no podrá iniciar sesión

> El usuario no se elimina permanentemente, solo se desactiva.

### 3.4 Modificar Usuario *(Solo administradores)*
1. Presionar el botón **"Modificar Usuario"**
2. Ingresar el **usuario** a modificar
3. Actualizar **nombre** y/o **email**
4. Presionar **"Modificar"**

---

## 4. Restablecer Contraseña *(Solo Administrador)*

Para acceder: **Menú Principal → Restablecer Contraseñas**

1. Ingresar el **usuario**
2. Ingresar la **nueva contraseña**
3. **Confirmar** la nueva contraseña
4. Presionar **"Restablecer"**

**Requisitos de la contraseña:**
-  Mínimo **13 caracteres**
-  Al menos **1 letra mayúscula**
-  Al menos **1 signo especial** (!@#$%...)

---

## Mensajes de error comunes

| Mensaje | Causa |
|---------|-------|
| "Campos vacíos" | Se dejó algún campo sin llenar |
| "Las contraseñas no coinciden" | La contraseña y confirmación son diferentes |
| "El email ya está vinculado a otro usuario" | El email ingresado ya existe |
| "Usuario desactivado" | El usuario fue desactivado por el administrador |
| "Cuenta bloqueada" | Se fallaron 3 intentos de login |

---

## Estructura del proyecto

```
src/
  main/
    java/com/mycompany/laboratorio2jbran/
      Laboratorio2jbran.java   → Clase principal
      login.java               → Pantalla de login
      menu.java                → Menú principal
      usuarios.java            → Gestión de usuarios
      crearusuario.java        → Crear usuario
      modificarusuario.java    → Modificar usuario
      respassword.java         → Restablecer contraseña
      GestorUsuarios.java      → Lógica de negocio
      usuario.java             → Clase modelo
    resources/images/          → Íconos e imágenes
```
