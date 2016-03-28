/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

/**
 * Generated file

 * Generated from: yang module name: netty-event-executor  yang module local name: netty-hashed-wheel-timer
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Tue Nov 19 12:49:59 CET 2013
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.netty.timer;

import org.opendaylight.controller.config.api.DependencyResolver;
import org.osgi.framework.BundleContext;

public class HashedWheelTimerModuleFactory extends AbstractHashedWheelTimerModuleFactory {
    @Override
    public HashedWheelTimerModule instantiateModule(String instanceName, DependencyResolver dependencyResolver,
            HashedWheelTimerModule oldModule, AutoCloseable oldInstance, BundleContext bundleContext) {
        HashedWheelTimerModule module = super.instantiateModule(instanceName, dependencyResolver, oldModule,
                oldInstance, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }

    @Override
    public HashedWheelTimerModule instantiateModule(String instanceName, DependencyResolver dependencyResolver,
            BundleContext bundleContext) {
        HashedWheelTimerModule module = super.instantiateModule(instanceName, dependencyResolver, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }
}
