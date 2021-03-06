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

package org.proton.plug;

import io.netty.buffer.ByteBuf;

/**
 * @author Clebert Suconic
 */

public interface AMQPConnectionCallback
{
   void close();

   /**
    * this is called when bytes are available to be sent to the client.
    * you have to callback {@link org.proton.plug.AMQPConnectionContext#outputDone(int)} after you're done with this buffer
    *
    * @param bytes
    */
   void onTransport(ByteBuf bytes, AMQPConnectionContext connection);

   AMQPSessionCallback createSessionCallback(AMQPConnectionContext connection);

   void setConnection(AMQPConnectionContext connection);

   AMQPConnectionContext getConnection();

   ServerSASL[] getSASLMechnisms();
}
