# Bend Language Support for the IntelliJ Platform 🚀

<p align="center">
    <picture>
        <source srcset="./images/higherorderco-logo.gif" media="(prefers-color-scheme: dark)"/>
        <img src="./images/higherorderco-logo.gif" width="830" alt="HigherOrderCO logo" />
    </picture>
</p>

![Build](https://github.com/lukeribchester/bend-intellij/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/24451.svg)](https://plugins.jetbrains.com/plugin/24451)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/24451.svg)](https://plugins.jetbrains.com/plugin/24451)

<!-- Plugin description -->
This plugin provides support for [Higher Order Company's](https://higherorderco.com/) Bend parallel programming language to 
the IntelliJ Platform.

_**Warning:** While effort is made to ensure a stable and reliable user experience, this plugin is under heavy
development._

## What is Bend?

Bend is a massively parallel, high-level programming language.

Unlike low-level alternatives like CUDA and Metal, Bend has the feeling and features of expressive languages like 
Python and Haskell, including fast object allocations, higher-order functions with full closure support, unrestricted 
recursion, even continuations. Yet, it runs on massively parallel hardware like GPUs, with near-linear speedup based on 
core count, and zero explicit parallel annotations: no thread spawning, no locks, mutexes, atomics. Bend is powered by 
the HVM2 runtime.

- [**Get started with Bend**](https://github.com/HigherOrderCO/bend/blob/main/GUIDE.md)

<!-- Plugin description end -->

---

## Installation

### JetBrains Marketplace

Install using your IDE's built-in plugin marketplace:

1. Navigate to <kbd>Settings/Preferences</kbd>
2. Select <kbd>Plugins</kbd> > <kbd>Marketplace</kbd>
3. Search for <kbd>'Bend'</kbd>
4. Select <kbd>Install Plugin</kbd>

View on the [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/24451-bend).

### Manual

Download the [latest release](https://github.com/lukeribchester/bend-intellij/releases/latest) and install it manually
from disk through your IDE:

1. Navigate to <kbd>Settings/Preferences</kbd>
2. Select <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install Plugin from Disk...</kbd>
3. Open the downloaded `.zip` file
