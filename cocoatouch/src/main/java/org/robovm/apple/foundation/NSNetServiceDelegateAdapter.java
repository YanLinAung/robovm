/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSNetServiceDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSNetServiceDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("netServiceWillPublish:")
    public void netServiceWillPublish$(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceDidPublish:")
    public void netServiceDidPublish$(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netService:didNotPublish:")
    public void netService$didNotPublish$(NSNetService sender, NSDictionary<?, ?> errorDict) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceWillResolve:")
    public void netServiceWillResolve$(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceDidResolveAddress:")
    public void netServiceDidResolveAddress$(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netService:didNotResolve:")
    public void netService$didNotResolve$(NSNetService sender, NSDictionary<?, ?> errorDict) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceDidStop:")
    public void netServiceDidStop$(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netService:didUpdateTXTRecordData:")
    public void netService$didUpdateTXTRecordData$(NSNetService sender, NSData data) { throw new UnsupportedOperationException(); }
    @NotImplemented("netService:didAcceptConnectionWithInputStream:outputStream:")
    public void netService$didAcceptConnectionWithInputStream$outputStream$(NSNetService sender, NSInputStream inputStream, NSOutputStream outputStream) { throw new UnsupportedOperationException(); }
    /*</methods>*/
}
