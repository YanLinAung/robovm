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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFGregorianUnits/*</name>*/ 
    extends /*<extends>*/Struct<CFGregorianUnits>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFGregorianUnitsPtr extends Ptr<CFGregorianUnits, CFGregorianUnitsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CFGregorianUnits() {}
    public CFGregorianUnits(int years, int months, int days, int hours, int minutes, double seconds) {
        this.years(years);
        this.months(months);
        this.days(days);
        this.hours(hours);
        this.minutes(minutes);
        this.seconds(seconds);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int years();
    @StructMember(0) public native CFGregorianUnits years(int years);
    @StructMember(1) public native int months();
    @StructMember(1) public native CFGregorianUnits months(int months);
    @StructMember(2) public native int days();
    @StructMember(2) public native CFGregorianUnits days(int days);
    @StructMember(3) public native int hours();
    @StructMember(3) public native CFGregorianUnits hours(int hours);
    @StructMember(4) public native int minutes();
    @StructMember(4) public native CFGregorianUnits minutes(int minutes);
    @StructMember(5) public native double seconds();
    @StructMember(5) public native CFGregorianUnits seconds(double seconds);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
