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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSStringExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSStringExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private NSStringExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UITextAttributeFont", optional=true)
    public static native NSString AttributeFont();
    @GlobalValue(symbol="UITextAttributeTextColor", optional=true)
    public static native NSString AttributeTextColor();
    @GlobalValue(symbol="UITextAttributeTextShadowColor", optional=true)
    public static native NSString AttributeTextShadowColor();
    @GlobalValue(symbol="UITextAttributeTextShadowOffset", optional=true)
    public static native NSString AttributeTextShadowOffset();
    
    @Method(selector = "sizeWithFont:")
    public static native @ByVal CGSize getSize(NSString thiz, UIFont font);
    @Method(selector = "sizeWithFont:forWidth:lineBreakMode:")
    public static native @ByVal CGSize getSize(NSString thiz, UIFont font, @MachineSizedFloat double width, NSLineBreakMode lineBreakMode);
    @Method(selector = "drawAtPoint:withFont:")
    public static native @ByVal CGSize draw(NSString thiz, @ByVal CGPoint point, UIFont font);
    @Method(selector = "drawAtPoint:forWidth:withFont:lineBreakMode:")
    public static native @ByVal CGSize draw(NSString thiz, @ByVal CGPoint point, @MachineSizedFloat double width, UIFont font, NSLineBreakMode lineBreakMode);
    @Method(selector = "sizeWithFont:constrainedToSize:")
    public static native @ByVal CGSize getSize(NSString thiz, UIFont font, @ByVal CGSize size);
    @Method(selector = "sizeWithFont:constrainedToSize:lineBreakMode:")
    public static native @ByVal CGSize getSize(NSString thiz, UIFont font, @ByVal CGSize size, NSLineBreakMode lineBreakMode);
    @Method(selector = "drawInRect:withFont:")
    public static native @ByVal CGSize draw(NSString thiz, @ByVal CGRect rect, UIFont font);
    @Method(selector = "drawInRect:withFont:lineBreakMode:")
    public static native @ByVal CGSize draw(NSString thiz, @ByVal CGRect rect, UIFont font, NSLineBreakMode lineBreakMode);
    @Method(selector = "drawInRect:withFont:lineBreakMode:alignment:")
    public static native @ByVal CGSize draw(NSString thiz, @ByVal CGRect rect, UIFont font, NSLineBreakMode lineBreakMode, NSTextAlignment alignment);
    @Method(selector = "sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    public static native @ByVal CGSize getSize(NSString thiz, UIFont font, @MachineSizedFloat double minFontSize, MachineSizedFloatPtr actualFontSize, @MachineSizedFloat double width, NSLineBreakMode lineBreakMode);
    @Method(selector = "drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    public static native @ByVal CGSize draw(NSString thiz, @ByVal CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double fontSize, NSLineBreakMode lineBreakMode, UIBaselineAdjustment baselineAdjustment);
    @Method(selector = "drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    public static native @ByVal CGSize draw(NSString thiz, @ByVal CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double minFontSize, MachineSizedFloatPtr actualFontSize, NSLineBreakMode lineBreakMode, UIBaselineAdjustment baselineAdjustment);
    @Method(selector = "sizeWithAttributes:")
    public static native @ByVal CGSize getSize(NSString thiz, NSDictionary<NSString, ?> attrs);
    @Method(selector = "drawAtPoint:withAttributes:")
    public static native void draw(NSString thiz, @ByVal CGPoint point, NSDictionary<NSString, ?> attrs);
    @Method(selector = "drawInRect:withAttributes:")
    public static native void draw(NSString thiz, @ByVal CGRect rect, NSDictionary<NSString, ?> attrs);
    @Method(selector = "drawWithRect:options:attributes:context:")
    public static native void draw(NSString thiz, @ByVal CGRect rect, NSStringDrawingOptions options, NSDictionary<NSString, ?> attributes, NSStringDrawingContext context);
    @Method(selector = "boundingRectWithSize:options:attributes:context:")
    public static native @ByVal CGRect getBoundingRect(NSString thiz, @ByVal CGSize size, NSStringDrawingOptions options, NSDictionary<NSString, ?> attributes, NSStringDrawingContext context);
    /*</methods>*/
}
