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
 * TODO
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
interface Deployer
{
   //-------------------------------------------------------------------------------||
   // Contracts --------------------------------------------------------------------||
   //-------------------------------------------------------------------------------||
   
   /**
    * TODO Is this how we create a builder; via the Deployer itself?
    */
   <T extends DeploymentBuilderBase<T>> T createDeploymentBuilder(Class<T> type);

   /**
    * Deploys the specified {@link Deployment}.  This method will block
    * until either the deployment has completed successfully with 
    * {@link DeploymentState#DEPLOYED} or will throw a {@link DeploymentException}
    * if there was an error and the state of the deployment is {@link DeploymentState#ERROR}
    * 
    * @param deployment The deployment to deploy
    * @throws DeploymentException If an error occurred during deployment
    * @throws IllegalArgumentException If the {@link Deployment} was not provided
    * @throws IllegalStateException If the specified {@link Deployment} is in any state 
    * aside from {@link DeploymentState#CREATED} or {@link DeploymentState#UNDEPLOYED}
    */
   void deploy(Deployment deployment) throws DeploymentException, IllegalArgumentException, IllegalStateException;

   /**
    * 
    * @param deployment
    * @throws IllegalArgumentException
    * @throws IllegalStateException
    */
   void deployInBackground(Deployment deployment) throws IllegalArgumentException, IllegalStateException;

}
