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
 * Indicates an error occurred while the {@link Deployer} was deploying a
 * {@link Deployment} 
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public class DeploymentException extends Exception
{

   //-------------------------------------------------------------------------------||
   // Class Members ----------------------------------------------------------------||
   //-------------------------------------------------------------------------------||

   /**
    * serialVersionUID
    */
   private static final long serialVersionUID = 1L;

   //-------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------||
   //-------------------------------------------------------------------------------||

   /**
    * Internal constructor; clients should use {@link DeploymentException#newInstance(String, Throwable)} 
    * @param message
    * @param cause
    */
   private DeploymentException(final String message, final Throwable cause)
   {
      super(message, cause);
   }

   //-------------------------------------------------------------------------------||
   // Factory Method ---------------------------------------------------------------||
   //-------------------------------------------------------------------------------||

   /**
    * Creates and returns a new instance from the specified required parameters
    * @param message
    * @param cause
    * @return
    * @throws IllegalArgumentException If either argument was not specified
    */
   public static DeploymentException newInstance(final String message, final Throwable cause)
         throws IllegalArgumentException
   {
      // Precondition checks
      if (message == null || message.length() == 0)
      {
         throw new IllegalArgumentException("message must be specified");
      }
      if (cause == null)
      {
         throw new IllegalArgumentException("cause must be specified");
      }

      // Construct and return
      return new DeploymentException(message, cause);
   }

}
