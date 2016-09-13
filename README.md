# Business Ecosystem RSS

[![License](https://img.shields.io/badge/license-AGPL%203.0-blue.svg?style=flat)](https://opensource.org/licenses/AGPL-3.0) [![Docs](https://img.shields.io/badge/docs-latest-brightgreen.svg?style=flat)](http://business-api-ecosystem.readthedocs.io/en/latest/) [![Docker](https://img.shields.io/docker/pulls/conwetlab/biz-ecosystem-rss.svg)](https://hub.docker.com/r/conwetlab/biz-ecosystem-rss) [![Support](https://img.shields.io/badge/support-askbot-yellowgreen.svg)](https://ask.fiware.org) [![Build Status](https://build.conwet.fi.upm.es/jenkins/buildStatus/icon?job=RSS)](https://build.conwet.fi.upm.es/jenkins/job/BusinessEcosystemRSS/)

 * [Introduction](#introduction)
 * [GEi Overall Description](#gei-overall-description)
 * [Installation](#build-and-install)
 * [API Reference](#api-reference)
 * [Testing](#testing)
 * [Advanced Topics](#advanced-topics)

# Introduction

This is the code repository for the Business Ecosystem RSS, one of the components that made up the [Business API Ecosystem GE](https://github.com/FIWARE-TMForum/Business-API-Ecosystem). The Business API Ecosystem is part of [FIWARE](https://www.fiware.org), and has been developed in collaboration with the [TM Forum](https://www.tmforum.org/).

Any feedback is highly welcome, including bugs, typos or things you think should be included but aren't. You can use [GitHub Issues](https://github.com/FIWARE-TMForum/business-ecosystem-rss/issues/new) to provide feedback.

# GEi Overal Description

The Business API Ecosystem is a joint component made up of the FIWARE Business Framework and a set of APIs (and its reference implementations) provided by the TMForum. This component allows the monetization of different kind of assets (both digital and physical) during the whole service life cycle, from offering creation to its charging, accounting and revenue settlement and sharing. The Business API Ecosystem exposes its complete functionality through TMForum standard APIs; concretely, it includes the catalog management, ordering management, inventory management, usage management, billing, customer, and party APIs.

In this context, the Business Ecosystem RSS is in charge of distributing the revenues originated by the usage of a given service among the involved stakeholders. In particular, it focuses on distributing part of the revenue generated by a service between the Business API Ecosystem instance provider and the Service Provider(s) responsible for the service. With the term "service" we refer to both final applications and backend application services (typically exposed through an API). Note that, in the case of composite services, more than one service provider may have to receive a share of the revenues.

# Installation

The Business Ecosystem RSS is installed as part of the Business API Ecosystem, so the instructions to install it can be found at [the Business API Ecosystem Installation Guide](http://business-api-ecosystem.readthedocs.io/en/latest/installation-administration-guide.html). You can install the software in three different ways:

* Using the provided script
* Using a [Docker Container]()
* Manually

# API Reference

For further documentation, you can check the API Reference available at:

* [Apiary](http://docs.fiwaretmfbizecosystem.apiary.io)
* [GitHub Pages](https://fiware-tmforum.github.io/Business-API-Ecosystem/)

# Testing

To execute the unit tests, just run:

```
mvn test -fae
```

## Advanced Topics

* [User & Programmers Guide](https://github.com/FIWARE-TMForum/Business-API-Ecosystem/blob/master/doc/user-programmer-guide.rst)
* [Installation & Administration Guide](https://github.com/FIWARE-TMForum/Business-API-Ecosystem/blob/master/doc/installation-administration-guide.rst)

You can also find this documentation on [ReadTheDocs](http://business-api-ecosystem.readthedocs.io)

