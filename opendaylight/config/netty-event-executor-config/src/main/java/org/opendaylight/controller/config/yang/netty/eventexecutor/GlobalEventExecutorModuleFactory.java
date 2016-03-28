/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

/**
 * Generated file

 * Generated from: yang module name: netty-event-executor  yang module local name: netty-global-event-executor
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Tue Nov 12 10:44:21 CET 2013
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.netty.eventexecutor;

import static com.google.common.base.Preconditions.checkArgument;
import org.opendaylight.controller.config.api.DependencyResolver;
import org.osgi.framework.BundleContext;

public class GlobalEventExecutorModuleFactory extends org.opendaylight.controller.config.yang.netty.eventexecutor.AbstractGlobalEventExecutorModuleFactory {
    public static final String SINGLETON_NAME = "singleton";


    @Override
    public GlobalEventExecutorModule instantiateModule(String instanceName, DependencyResolver dependencyResolver, GlobalEventExecutorModule oldModule, AutoCloseable oldInstance, BundleContext bundleContext) {
        checkArgument(SINGLETON_NAME.equals(instanceName),"Illegal instance name '" + instanceName + "', only allowed name is " + SINGLETON_NAME);
        GlobalEventExecutorModule module = super.instantiateModule(instanceName, dependencyResolver, oldModule,
                oldInstance, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }

    @Override
    public GlobalEventExecutorModule instantiateModule(String instanceName, DependencyResolver dependencyResolver, BundleContext bundleContext) {
        checkArgument(SINGLETON_NAME.equals(instanceName),"Illegal instance name '" + instanceName + "', only allowed name is " + SINGLETON_NAME);
        GlobalEventExecutorModule module = super.instantiateModule(instanceName, dependencyResolver, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }
}
