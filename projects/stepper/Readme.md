# Formulario de varios pasos:
Los usuarios deben ser capaces de:
- Completar cada paso de la secuencia
Volver a un paso anterior para actualizar sus selecciones.
- Ver un resumen de sus selecciones en el último paso y confirmar su orden.
- El diseño debe ser responsivo.(podrian optar por un desarrollo mobile first)
- Recibir mensajes de validación del formulario si
    - Se ha omitido un campo
    - La dirección de correo electrónico no está formateada correctamente
    - Se ha enviado un paso, pero no se ha realizado ninguna selección

## Historia de Usuario: Formulario de Suscripción en Múltiples Pasos

### Descripción
Como usuario, quiero completar un formulario en múltiples pasos para proporcionar mi información personal, seleccionar un plan de suscripción, elegir complementos y revisar mis elecciones antes de confirmar la suscripción.

### Pasos y Campos

#### Paso 1: Información Personal

**Descripción:** Como usuario, quiero proporcionar mi información personal para poder proceder con la suscripción.

**Campos:**
- Nombre: Campo de entrada para ingresar el nombre completo del usuario.
- Correo Electrónico: Campo de entrada para ingresar la dirección de correo electrónico del usuario (ejemplo: "e.g. stephenking@lorem.com").
- Número de Teléfono: Campo de entrada para ingresar el número de teléfono del usuario (ejemplo: "+1 234 567 890").

**Acciones:**
   - Botón "Siguiente Paso" para avanzar al siguiente paso.

#### Paso 2: Selecciona Tu Plan
Descripción: Como usuario, quiero elegir un plan de suscripción que se ajuste a mis necesidades.

**Opciones:**

- Arcade: Opción de plan con un precio de $9/mes.
- Advanced: Opción de plan con un precio de $12/mes.
- Pro: Opción de plan con un precio de $15/mes.

***Frecuencia de Facturación:***

- Conmutador Mensual/Anual: Opción para seleccionar la frecuencia de facturación, ya sea mensual o anual.

**Acciones:**
- Botón "Regresar" para volver al paso anterior.
- Botón "Siguiente Paso" para avanzar al siguiente paso.

#### Paso 3: Elige Complementos
**Descripción:** Como usuario, quiero seleccionar características adicionales para mejorar mi experiencia de suscripción.

**Complementos:**
- Servicio en Línea: Opción para agregar servicios en línea con un costo extra de $1/mes.
- Mayor Almacenamiento: Opción para aumentar el almacenamiento por un costo adicional de $2/mes.
- Perfil Personalizable: Opción para personalizar el perfil con un costo de $2/mes.

**Acciones:**
- Botón "Regresar" para volver al paso anterior.
Botón "Siguiente Paso" para avanzar al siguiente paso.
#### Paso 4: Finalizando
**Descripción:** Como usuario, quiero revisar mis elecciones antes de confirmar mi suscripción.

**Campos:**
- Plan Seleccionado: Muestra el plan seleccionado y su costo mensual.
- Complementos Seleccionados: Muestra los complementos seleccionados y sus respectivos costos.
Costo Total: Muestra el costo total mensual.

**Acciones:**
- Botón "Regresar" para volver al paso anterior.
- Botón "Confirmar" para finalizar la suscripción.
### Criterios de Aceptación
- El usuario puede navegar a través de cada paso utilizando los botones "Siguiente Paso" y "Regresar".
- El formulario debe conservar la información ingresada por el usuario al navegar entre pasos.
- El costo total debe actualizarse dinámicamente en función del plan y los complementos seleccionados.
- El usuario puede revisar todas las opciones seleccionadas en el paso final antes de confirmar la suscripción.