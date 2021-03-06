/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.hornetq.core.protocol.openwire.amq;

import org.apache.activemq.broker.region.MessageReference;
import org.apache.activemq.command.ActiveMQDestination;

/**
 * An interface for recoverying transient messages held by the broker for
 * retractive recovery for subscribers
 *
 *
 */
public interface AMQSubscriptionRecovery
{

   /**
    * Add a message to the SubscriptionRecovery
    *
    * @param context
    * @param message
    * @return true if the message is accepted
    * @throws Exception
    */
   boolean addRecoveredMessage(AMQConnectionContext context, MessageReference message) throws Exception;

   /**
    * @return the Destination associated with this Subscription
    */
   ActiveMQDestination getActiveMQDestination();

}
