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
package org.robovm.apple.coredata;

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
import org.robovm.apple.foundation.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMergeConflict/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSMergeConflictPtr extends Ptr<NSMergeConflict, NSMergeConflictPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMergeConflict.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMergeConflict() {}
    protected NSMergeConflict(SkipInit skipInit) { super(skipInit); }
    public NSMergeConflict(NSManagedObject srcObject, @MachineSizedUInt long newvers, @MachineSizedUInt long oldvers, NSDictionary<?, ?> cachesnap, NSDictionary<?, ?> persnap) { super((SkipInit) null); initObject(initWithSource$newVersion$oldVersion$cachedSnapshot$persistedSnapshot$(srcObject, newvers, oldvers, cachesnap, persnap)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceObject")
    public native NSManagedObject getSourceObject();
    @Property(selector = "objectSnapshot")
    public native NSDictionary<?, ?> getObjectSnapshot();
    @Property(selector = "cachedSnapshot")
    public native NSDictionary<?, ?> getCachedSnapshot();
    @Property(selector = "persistedSnapshot")
    public native NSDictionary<?, ?> getPersistedSnapshot();
    @Property(selector = "newVersionNumber")
    public native @MachineSizedUInt long getNewVersionNumber();
    @Property(selector = "oldVersionNumber")
    public native @MachineSizedUInt long getOldVersionNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:newVersion:oldVersion:cachedSnapshot:persistedSnapshot:")
    protected native @Pointer long initWithSource$newVersion$oldVersion$cachedSnapshot$persistedSnapshot$(NSManagedObject srcObject, @MachineSizedUInt long newvers, @MachineSizedUInt long oldvers, NSDictionary<?, ?> cachesnap, NSDictionary<?, ?> persnap);
    /*</methods>*/
}
