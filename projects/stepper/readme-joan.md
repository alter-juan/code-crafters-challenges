# Proyecto de suscripción paso a paso - React 🚀

Este proyecto es una aplicación web que implementa un formulario de suscripción de varios pasos en **[React](https://reactjs.org/)**, con **[TypeScript](https://www.typescriptlang.org/)** y herramientas modernas como **[Vite](https://vitejs.dev/)** y **[Vitest](https://vitest.dev/)** para pruebas y compilación rápidas. El objetivo es permitir a los usuarios suscribirse a diferentes planes mediante una interfaz intuitiva y escalable.


## Tabla de contenido 📚

- [1. Objetivos del Proyecto](#1-objetivos-del-proyecto-)
- [2. Descripción del Proyecto](#2-descripción-del-proyecto-)
- [3. Tecnologías Utilizadas](#3-tecnologías-usadas-️)
- [4. Estructura del Proyecto](#4-estructura-del-proyecto-️)
- [5. Flujo de Datos](#5-flujo-de-datos-)
- [6. Pruebas y Cobertura](#6-pruebas-y-cobertura-)
- [7. Requisitos previos](#7-requisitos-previos-)
- [8. Instalación](#8-instalación-️)
- [9. Uso](#9-uso-)
- [10. Comandos Importantes](#10-comandos-importantes-)
- [11. Recomendaciones del Editor](#11-recomendaciones-del-editor-)

## 1. Objetivos del Proyecto 🥅

- Ofrecer una experiencia de usuario fluida para gestionar suscripciones en varios pasos.
- Facilitar la administración de planes y opciones adicionales en suscripciones.
- Mantener un código modular, reutilizable y fácil de mantener a largo plazo.

## 2. Descripción del Proyecto 🎯

Este proyecto permite a los usuarios realizar suscripciones a un plan mediante un formulario de varios pasos. Incluye los siguientes pasos:

- **Datos personales del usuario.**
- **Selección de plan de suscripción.**
- **Selección de complementos adicionales.**
- **Resumen de suscripción**, donde el usuario confirma los datos antes de enviarlos.

La aplicación utiliza Redux para manejar el estado global, asegurando la persistencia de los datos mientras el usuario navega entre pasos.

## 3. Tecnologías Usadas 🛠️

- **[React](https://reactjs.org/)** ⚛️: Creación de una interfaz de usuario interactiva y modular.
- **[Vite](https://vitejs.dev/)** ⚡: Compilador rápido y optimizado para desarrollo con React.
- **[TypeScript](https://www.typescriptlang.org/)** 📝: Tipado estático para mejorar la robustez y el mantenimiento del código.
- **[Vitest](https://vitest.dev/)** 🧪: Herramienta de pruebas moderna y eficiente, compatible con TypeScript y JSX.
- **[Tailwind CSS](https://tailwindcss.com/)** 🎨: Framework CSS basado en utilidades para un diseño consistente y responsivo.
- **[Redux](https://redux.js.org/)** 🌐: Para manejar el estado global de la aplicación de forma estructurada y eficiente.

## 4. Estructura del Proyecto 🗂️

La aplicación está organizada en módulos para facilitar la escalabilidad y el mantenimiento. Cada módulo representa una parte del flujo de suscripción, lo que permite que cada paso maneje su lógica de manera independiente.

```plaintext
/src
│
├── /subscription             # Módulo de suscripción
│   ├── /adapters             # Adaptadores de datos
│   ├── /components           # Componentes React específicos
│   ├── /models               # Modelos de datos
│   ├── /use-cases            # Casos de uso
│   ├── /validators           # Validaciones para casos de uso y/o formularios.
│   ├── /services             # Servicios de API
│   └── /tests                # Pruebas unitarias
│
├── /shared                   # Recursos reutilizables entre módulos
│   ├── /components           # Componentes compartidos
│   └── /hooks                # Custom hooks
│
├── /styles                   # Estilos globales y específicos
│
├── App.tsx                   # Punto de entrada de la aplicación
├── index.tsx                 # Archivo principal que monta la app
└── tailwind.config.ts        # Configuración de Tailwind css
└── vite.config.ts            # Configuración de Vite
└── vitest.config.ts          # Configuración de Test

```

- **/subscription**: Este es el núcleo del proyecto, ya que maneja el flujo de suscripción. Contiene los componentes del formulario, las validaciones de datos y la lógica de negocio para procesar la suscripción.

- **/adapters**: Aquí se transforman los datos que provienen del backend o se envían a la API.

- **/models**: Contiene los tipos e interfaces de TypeScript que representan los datos manejados por el formulario, garantizando que el tipado sea coherente en toda la aplicación.

- **/use-cases**: Esta carpeta contiene la lógica de negocio central del módulo, como el procesamiento y envío de los datos de suscripción a la API.

- **/validators**: Maneja las validaciones generales del modulo y/o de los casos de uso.

- **/services**: Aquí se definen las interacciones.

- **/shared**: Incluye componentes y hooks que pueden ser utilizados por cualquier módulo de la aplicación.

## 5. Flujo de datos 🔄

![image](https://github.com/user-attachments/assets/9bf73960-aec4-4c4a-a3e0-b4a24b0eaa18)
**Frontend:**

El Módulo de Suscripción gestiona el formulario de suscripción completo.
Dentro del módulo, tiene los componentes que representan cada paso del formulario:

**Step1**: Datos personales.

**Step2**: Selección de plan.

**Step3**: Selección de complementos.

**Resumen**: Muestra el resumen de las selecciones antes de confirmar.

**Store**: Maneja el estado global del modulo, lo que permite que los datos ingresados en cada componente de paso se almacenen, compartan y persistan mientras el usuario navega entre pasos.

### 6. Pruebas y Cobertura 🧪

Este proyecto usa Vitest para pruebas y utiliza el estilo Given-When-Then (GWT) para escribir y estructurar las pruebas. Este enfoque es común en Behavior-Driven Development (BDD) y Acceptance Test-Driven Development (ATDD), ya que proporciona una forma clara y comprensible de describir el comportamiento del sistema o de una característica.

Estructura de Pruebas GWT:

- **Given (Dado):** Describe el contexto inicial o estado del sistema antes de que ocurra la acción que se está probando. Aquí se preparan las precondiciones necesarias.
- **When (Cuando):** Representa la acción o evento que se está probando. Es el comportamiento o interacción específica que se desea verificar.
- **Then (Entonces):** Expresa el resultado esperado después de la acción. Define el comportamiento esperado o el estado final del sistema tras ejecutar la acción.

Este enfoque ayuda a que las pruebas sean claras y comprensibles, aplicables tanto a pruebas unitarias, pruebas de integración y pruebas de extremo a extremo (E2E).

### Pruebas con [Vitest](https://vitest.dev/) ⚡

Vitest es un framework de pruebas moderno y rápido para JavaScript. Soporta TypeScript y JSX, lo que lo convierte en una excelente opción para desarrollar aplicaciones modernas.

- **Velocidad:** Vitest es extremadamente rápido, permitiendo ejecutar pruebas unitarias e integradas de manera eficiente.
- **Compatibilidad:** Soporte nativo para TypeScript y JSX.
- **Características:** Soporta pruebas de afirmación, mocks y stubbing, con una interfaz clara para ver los resultados.

Para ejecutar las pruebas unitarias, usa el siguiente comando:

```
npm run test
```
### [Vitest UI](https://vitest.dev/guide/ui.html) 🖥️

Proporciona una interfaz de usuario para ver e interactuar con sus pruebas en tiempo real, permitiendo monitorear el estado de tus pruebas, identificar errores rápidamente y optimizar el flujo de desarrollo. 

- Visualizar todas las pruebas en una interfaz interactiva.
- Filtrar pruebas según su estado (aprobadas, fallidas, pendientes).
- Ver resultados y errores detallados en tiempo real.
  
  ![image](https://github.com/user-attachments/assets/a5174ae0-9f7a-4a08-a00a-18dee3b4bc6d)



### Cobertura / [Coverage](https://vitest.dev/guide/coverage) 📙

Vitest también incluye una funcionalidad para medir la cobertura del código, lo cual es importante para garantizar que tu código esté bien cubierto por pruebas y que las áreas críticas estén correctamente testeadas.

Para generar un informe de cobertura de código, ejecuta:

```
npm run coverage
```

En la raiz del proyecto se creara un carpeta llamada `coverage` donde esta el reporte detallado de la covertura de los test en el proyecto, para ver el reporte abrir en el navegador o con liveServer el archivo `index.html` y vera un reporte similar a este

![Coverage](https://github.com/user-attachments/assets/60f2dae9-e403-4a89-867d-90343b758954)

y puede ver el detalle de covertura por archivo ingresando a cada uno por ejemplo:
![Coverage](https://github.com/user-attachments/assets/46b5cd1d-674c-4a66-917f-e803b7c3c262)

## 7. Requisitos previos 📋

Asegúrate de tener instaladas las siguientes herramientas antes de comenzar:

- **[Node.js](https://nodejs.org/en/)** (>=14.x)
- **[npm](https://www.npmjs.com/) (>=6.x)** o **[yarn](https://yarnpkg.com/)**
- **[Git](https://git-scm.com/)** para clonar el repositorio

## 8. Instalación 🖥️

1.  Clona el repositorio:

```sh
git clone https://github.com/JoanBeltranAlt/subscription.git
cd subscription

```

2.  Instala las dependencias:

```sh
npm install
```

## 9. Uso 🚁

Para iniciar el proyecto en modo desarrollo:

```sh
npm run dev
```

Visita http://localhost:3000 para ver la aplicación en tu navegador.

## 10. Comandos Importantes 📜

- Iniciar el servidor de desarrollo: `npm run dev`
- Compilar para producción: `npm run build`
- Ejecutar pruebas unitarias: `npm run test`
- Generar cobertura de código: `npm run coverage`
- Linter y formateo: `npm run lint`

## 11. Recomendaciones del Editor 📝

Se recomienda usar [Visual Studio Code (VSCode)](https://code.visualstudio.com/) para este proyecto debido a su compatibilidad con TypeScript, React y herramientas de desarrollo modernas como Vite. A continuación se detallan extensiones y configuraciones útiles para optimizar el desarrollo en VSCode.

### Extensiones Recomendadas

1. **[ESLint](https://eslint.org/)** 🧹

- **Descripción**: Asegura que el código siga las mejores prácticas y el estilo definido.
- **Instalación**: Busca "[ESLint](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint)" en el marketplace de VSCode.
- **Configuración**: Asegúrate de tener un archivo `.eslintrc.js` en tu proyecto para las reglas de linting.

2. **[Prettier - Code Formatter](https://prettier.io/)** ✨

- **Descripción**: Formatea automáticamente el código para mantener una estructura limpia y consistente.
- **Instalación**: Busca "[Prettier](https://marketplace.visualstudio.com/items?itemName=esbenp.prettier-vscode)" en el marketplace.
- **Configuración**: Configura Prettier para que se ejecute al guardar en el archivo de configuración del editor.

3. **[SonarLint](https://docs.sonarsource.com/sonarlint/intellij/?_gl=1*1htshdt*_gcl_au*MTEwOTg3MjYyLjE3MzExNzc2MzA.*_ga*NDUyNDEwMDQ1LjE3MzExNzc2NDE.*_ga_9JZ0GZ5TC6*MTczMTE3NzY0MS4xLjEuMTczMTE3NzY2Mi4zOS4wLjA.)** 🛠️

- **Descripción**: Detecta y reporta errores, problemas de calidad y vulnerabilidades de seguridad en tiempo real.
- **Instalación**: Busca "[SonarLint](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonarlint-vscode)" en el marketplace de VSCode.
  **Beneficios**: Asegura que el código cumple con los estándares de calidad y ayuda a prevenir problemas en producción.

4. **[Tailwind CSS IntelliSense](https://tailwindcss.com/docs/editor-setup)** 🌈

- **Descripción**: Proporciona autocompletado y resaltado de clases para Tailwind CSS.
- **Instalación**: Busca "[Tailwind CSS IntelliSense](https://marketplace.visualstudio.com/items?itemName=bradlc.vscode-tailwindcss)" en el marketplace.
- **Configuración**: Asegúrate de que Tailwind esté configurado en tu archivo `tailwind.config.js` para que funcione correctamente.

5. **[Pretty TypeScript Errors](https://github.com/yoavbls/pretty-ts-errors)** 🔍

- **Descripción**: Mejora la visualización de los errores de TypeScript, haciéndolos más legibles.
- **Instalación**: Busca "[Pretty TypeScript Errors](https://marketplace.visualstudio.com/items?itemName=yoavbls.pretty-ts-errors)" en el marketplace.
- **Beneficios**: Ayuda a interpretar los mensajes de error de TypeScript de forma más rápida y clara.

6. **[Code Coverage]((https://marketplace.visualstudio.com/items?itemName=markis.code-coverage))** 📊

- **Descripción**: Muestra la cobertura de código directamente en el editor.
- **Instalación**: Busca "[Code Coverage](https://marketplace.visualstudio.com/items?itemName=markis.code-coverage)" en el marketplace.
- **Configuración**: Compatible con archivos de cobertura generados por Vitest.
- **Beneficios**: Proporciona una visualización en el editor de las líneas cubiertas por pruebas, ayudando a identificar partes del código sin pruebas.

7. **[ES7+ React/Redux/React-Native snippets](https://marketplace.visualstudio.com/items?itemName=dsznajder.es7-react-js-snippets)** ⚛️

- **Descripción**: Ofrece atajos de código para componentes de React, Redux, hooks y más.
- **Instalación**: Busca "[ES7+ React/Redux/React-Native snippets](https://marketplace.visualstudio.com/items?itemName=dsznajder.es7-react-js-snippets)" en el marketplace.
- **Utilidad**: Ahorra tiempo con snippets como rfce para crear un componente funcional.

8. **[Vitest](https://marketplace.visualstudio.com/items?itemName=vitest.explorer)** 🧪

- **Descripción**: Herramienta de pruebas recomendada para este proyecto, compatible con TypeScript y JSX.
- **Instalación**: Busca "[Vitest](https://marketplace.visualstudio.com/items?itemName=vitest.explorer)" en el marketplace.
- **Integración**: Utiliza extensiones de cobertura como Code Coverage para ver las líneas probadas en el editor.

9. **[Vitest Snippets](https://marketplace.visualstudio.com/items?itemName=deinsoftware.vitest-snippets)** 📝

- **Descripción**: Proporciona atajos para escribir pruebas en Vitest.
- **Instalación**: Busca "[Vitest Snippets](https://marketplace.visualstudio.com/items?itemName=deinsoftware.vitest-snippets)" en el marketplace.
- **Utilidad**: Facilita la creación de pruebas mediante snippets como it para una prueba básica o describe para agrupar pruebas.

### Configuración Sugerida de VSCode

Agrega la siguiente configuración en el archivo `settings.json` de VSCode para mejorar la experiencia de desarrollo:

```json
{
  "cSpell.words": ["tseslint"],
  "editor.defaultFormatter": "esbenp.prettier-vscode",
  "editor.formatOnSave": true,
  "editor.codeActionsOnSave": {
    "source.fixAll.eslint": "always"
  }
}
```
