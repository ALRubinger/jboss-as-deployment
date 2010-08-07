/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
  *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.as.deployment;

/**
 * Represents the state of a {@link Deployment} 
 * 
 * <ul>
 * <li>{@link DeploymentState#CREATED} is the default state when a {@link Deployment} is created and has not yet been sent to the server</li>
 * <li>{@link DeploymentState#TRANSFERRING} indicates the {@link Deployment} is being sent to the server, possibly serializing over a network</li>
 * <li>{@link DeploymentState#DEPLOYING} indicates that the {@link Deployment} has been sent to the server and is currently in the process of deploying</li>
 * <li>{@link DeploymentState#DEPLOYED} indicates that the {@link Deployment} has been successfully deployed</li>
 * <li>{@link DeploymentState#ERROR} indicates that the {@link Deployment} could not be fully deployed due to an error</li>
 * <li>{@link DeploymentState#UNDEPLOYED} indicates that the {@link Deployment} has been successfully undeployed out of service</li>
 * </ul> 
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public enum DeploymentState {
   CREATED, TRANSFERRING, DEPLOYING, DEPLOYED, ERROR, UNDEPLOYED
}
