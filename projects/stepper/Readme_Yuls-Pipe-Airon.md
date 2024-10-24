# Design Document: Multi-step Subscription Form 🚀

## Repository
https://github.com/andresmarin0152/stepper_poc

## Project Overview
A multi-step subscription form built with React, TypeScript, Tailwind CSS, Shadcn/ui, and Zustand, following Atomic Design principles.

## Architecture Decisions

### Overview
In this project, we've chosen to implement Atomic Design methodology. This decision was driven by our desire to explore modern architecture patterns in a controlled environment before implementing them in larger-scale production projects.

### Why Atomic Design?

#### Rationale
1. **Scalability Testing**: The project's scope provides an ideal testing ground for Atomic Design principles without the complexity of a full-scale application
2. **Component Reusability**: The form's modular nature aligns perfectly with Atomic Design's component hierarchy
3. **Learning Opportunity**: Allows the team to evaluate the methodology's pros and cons in a controlled environment
4. **Future Implementation Insights**: Provides valuable insights for future enterprise-level implementations

#### Expected Benefits
- Clear component hierarchy
- Improved maintenance
- Consistent design language
- Efficient development workflow
- Better team collaboration

#### Potential Challenges
- Initial setup overhead
- Learning curve for team members
- Potential over-engineering for simple components

## Tech Stack
- React + TypeScript
- Tailwind CSS
- shadcn/ui
- Zustand
- Node V21.1.0

## Architecture Overview

### 1. Atomic Design Structure

#### Atoms (Basic Components)
- Input fields (text, email, phone)
- Labels
- Error messages
- Checkboxes
- Toggle switch (monthly/yearly billing)
- Buttons (Next, Cancel)
- Progress indicators
- Price tags

#### Molecules (Composite Components)
- Form field groups (label + input + error)
- Plan card (title, price, description, features)
- Additional card (checkbox + title + description + price)
- Summary item (service + price)
- Step indicator (number + title)

#### Organisms (Complex Components)
- Personal information form (Step 1)
- Plan selection form (Step 2)
- Additional selection form (Step 3)
- Summary form (Step 4)
- Navigation controls
- Progress bar

#### Templates
- Step layout template
- Mobile layout template
- Desktop layout template

#### Pages
- Main stepper page

### 2. File Structure

```
src/
├── assets/
│   ├── icons/
│   ├── images/
│   └── styles/
├── components/
│   ├── atoms/
│   │   ├── Button/
│   │   ├── Input/
│   │   ├── Label/
│   │   └── ErrorMessage/
│   ├── molecules/
│   │   ├── FormField/
│   │   ├── PlanCard/
│   │   ├── AddOnCard/
│   │   └── StepIndicator/
│   ├── organisms/
│   │   ├── PersonalInfoForm/
│   │   ├── PlanSelectionForm/
│   │   ├── AddOnsForm/
│   │   └── SummaryForm/
│   └── templates/
│       ├── StepLayout/
│       └── FormLayout/
├── pages/
│   └── RegisterForm/
├── utils/
│   ├── validation.ts
│   └── formatters.ts
├── store/
│   └── useFormStore.ts
├── services
│   └── serviceMock.ts
├── router.ts
|-- tailwind.config.js
|-- tsconfig.json
|-- vite.config.ts
└── app.ts
```
