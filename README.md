# Scala Auxiliary Constructor Default Parameter Initialization Subtlety

This repository demonstrates a subtle bug related to how Scala handles default parameter values in primary constructors when used within auxiliary constructors.  The issue revolves around the order of initialization and potential unexpected side effects.

## Bug Description

The `Bug.scala` file contains a `MyClass` with a primary constructor taking an integer `x` and an auxiliary constructor providing a default value of 0. This seemingly simple code hides a potential issue. The initialization of `x` within the primary constructor may not occur before other operations within the auxiliary constructor, leading to unexpected behavior.

## Bug Solution

The solution, found in `BugSolution.scala`, directly addresses this issue by ensuring proper initialization order.  Avoid relying on default parameter values within auxiliary constructors, instead making them explicit.