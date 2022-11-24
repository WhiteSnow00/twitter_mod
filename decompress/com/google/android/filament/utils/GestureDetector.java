// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import android.view.MotionEvent;
import java.util.List;
import android.view.View;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006(" }, d2 = { "Lcom/google/android/filament/utils/GestureDetector;", "", "Lvzv;", "endGesture", "", "isOrbitGesture", "isPanGesture", "isZoomGesture", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "Landroid/view/View;", "view", "Landroid/view/View;", "Lcom/google/android/filament/utils/Manipulator;", "manipulator", "Lcom/google/android/filament/utils/Manipulator;", "Lcom/google/android/filament/utils/GestureDetector$Gesture;", "currentGesture", "Lcom/google/android/filament/utils/GestureDetector$Gesture;", "Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "previousTouch", "Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "Ljava/util/ArrayList;", "tentativePanEvents", "Ljava/util/ArrayList;", "tentativeOrbitEvents", "tentativeZoomEvents", "", "kGestureConfidenceCount", "I", "kPanConfidenceDistance", "kZoomConfidenceDistance", "", "kZoomSpeed", "F", "<init>", "(Landroid/view/View;Lcom/google/android/filament/utils/Manipulator;)V", "Gesture", "TouchPair", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class GestureDetector
{
    private Gesture currentGesture;
    private final int kGestureConfidenceCount;
    private final int kPanConfidenceDistance;
    private final int kZoomConfidenceDistance;
    private final float kZoomSpeed;
    private final Manipulator manipulator;
    private TouchPair previousTouch;
    private final ArrayList<TouchPair> tentativeOrbitEvents;
    private final ArrayList<TouchPair> tentativePanEvents;
    private final ArrayList<TouchPair> tentativeZoomEvents;
    private final View view;
    
    public GestureDetector(final View view, final Manipulator manipulator) {
        e0e.f((Object)view, "view");
        e0e.f((Object)manipulator, "manipulator");
        this.view = view;
        this.manipulator = manipulator;
        this.currentGesture = Gesture.NONE;
        this.previousTouch = new TouchPair();
        this.tentativePanEvents = new ArrayList<TouchPair>();
        this.tentativeOrbitEvents = new ArrayList<TouchPair>();
        this.tentativeZoomEvents = new ArrayList<TouchPair>();
        this.kGestureConfidenceCount = 2;
        this.kPanConfidenceDistance = 4;
        this.kZoomConfidenceDistance = 10;
        this.kZoomSpeed = 0.1f;
    }
    
    private final void endGesture() {
        this.tentativePanEvents.clear();
        this.tentativeOrbitEvents.clear();
        this.tentativeZoomEvents.clear();
        this.currentGesture = Gesture.NONE;
        this.manipulator.grabEnd();
    }
    
    private final boolean isOrbitGesture() {
        return this.tentativeOrbitEvents.size() > this.kGestureConfidenceCount;
    }
    
    private final boolean isPanGesture() {
        final int size = this.tentativePanEvents.size();
        final int kGestureConfidenceCount = this.kGestureConfidenceCount;
        boolean b = false;
        if (size <= kGestureConfidenceCount) {
            return false;
        }
        final Float2 midpoint = ((TouchPair)rr4.C1((List)this.tentativePanEvents)).getMidpoint();
        final Float2 midpoint2 = ((TouchPair)rr4.K1((List)this.tentativePanEvents)).getMidpoint();
        final Float2 float2 = new Float2(midpoint.getX() - midpoint2.getX(), midpoint.getY() - midpoint2.getY());
        if ((float)Math.sqrt(float2.getY() * float2.getY() + float2.getX() * float2.getX()) > this.kPanConfidenceDistance) {
            b = true;
        }
        return b;
    }
    
    private final boolean isZoomGesture() {
        final int size = this.tentativeZoomEvents.size();
        final int kGestureConfidenceCount = this.kGestureConfidenceCount;
        boolean b = false;
        if (size <= kGestureConfidenceCount) {
            return false;
        }
        if (Math.abs(((TouchPair)rr4.K1((List)this.tentativeZoomEvents)).getSeparation() - ((TouchPair)rr4.C1((List)this.tentativeZoomEvents)).getSeparation()) > this.kZoomConfidenceDistance) {
            b = true;
        }
        return b;
    }
    
    public final void onTouchEvent(final MotionEvent motionEvent) {
        e0e.f((Object)motionEvent, "event");
        final TouchPair touchPair = new TouchPair(motionEvent, this.view.getHeight());
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            }
            else {
                if ((motionEvent.getPointerCount() != 1 && this.currentGesture == Gesture.ORBIT) || (motionEvent.getPointerCount() != 2 && this.currentGesture == Gesture.PAN) || (motionEvent.getPointerCount() != 2 && this.currentGesture == Gesture.ZOOM)) {
                    this.endGesture();
                    return;
                }
                final Gesture currentGesture = this.currentGesture;
                final Gesture zoom = Gesture.ZOOM;
                if (currentGesture == zoom) {
                    this.manipulator.scroll(touchPair.getX(), touchPair.getY(), (this.previousTouch.getSeparation() - touchPair.getSeparation()) * this.kZoomSpeed);
                    this.previousTouch = touchPair;
                    return;
                }
                if (currentGesture != Gesture.NONE) {
                    this.manipulator.grabUpdate(touchPair.getX(), touchPair.getY());
                    return;
                }
                if (motionEvent.getPointerCount() == 1) {
                    this.tentativeOrbitEvents.add(touchPair);
                }
                if (motionEvent.getPointerCount() == 2) {
                    this.tentativePanEvents.add(touchPair);
                    this.tentativeZoomEvents.add(touchPair);
                }
                if (this.isOrbitGesture()) {
                    this.manipulator.grabBegin(touchPair.getX(), touchPair.getY(), false);
                    this.currentGesture = Gesture.ORBIT;
                    return;
                }
                if (this.isZoomGesture()) {
                    this.currentGesture = zoom;
                    this.previousTouch = touchPair;
                    return;
                }
                if (this.isPanGesture()) {
                    this.manipulator.grabBegin(touchPair.getX(), touchPair.getY(), true);
                    this.currentGesture = Gesture.PAN;
                }
                return;
            }
        }
        this.endGesture();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lcom/google/android/filament/utils/GestureDetector$Gesture;", "", "(Ljava/lang/String;I)V", "NONE", "ORBIT", "PAN", "ZOOM", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public enum Gesture
    {
        private static final Gesture[] $VALUES;
        
        NONE, 
        ORBIT, 
        PAN, 
        ZOOM;
        
        private static final Gesture[] $values() {
            return new Gesture[] { Gesture.NONE, Gesture.ORBIT, Gesture.PAN, Gesture.ZOOM };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u000e¨\u0006+" }, d2 = { "Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "", "()V", "me", "Landroid/view/MotionEvent;", "height", "", "(Landroid/view/MotionEvent;I)V", "pt0", "Lcom/google/android/filament/utils/Float2;", "pt1", "count", "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V", "getCount", "()I", "setCount", "(I)V", "midpoint", "getMidpoint", "()Lcom/google/android/filament/utils/Float2;", "getPt0", "setPt0", "(Lcom/google/android/filament/utils/Float2;)V", "getPt1", "setPt1", "separation", "", "getSeparation", "()F", "x", "getX", "y", "getY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class TouchPair
    {
        private int count;
        private Float2 pt0;
        private Float2 pt1;
        
        public TouchPair() {
            this(new Float2(0.0f), new Float2(0.0f), 0);
        }
        
        public TouchPair(final MotionEvent motionEvent, final int n) {
            e0e.f((Object)motionEvent, "me");
            this();
            if (motionEvent.getPointerCount() >= 1) {
                final Float2 float2 = new Float2(motionEvent.getX(0), n - motionEvent.getY(0));
                this.pt0 = float2;
                this.pt1 = float2;
                ++this.count;
            }
            if (motionEvent.getPointerCount() >= 2) {
                this.pt1 = new Float2(motionEvent.getX(1), n - motionEvent.getY(1));
                ++this.count;
            }
        }
        
        public TouchPair(final Float2 pt0, final Float2 pt2, final int count) {
            e0e.f((Object)pt0, "pt0");
            e0e.f((Object)pt2, "pt1");
            this.pt0 = pt0;
            this.pt1 = pt2;
            this.count = count;
        }
        
        public static TouchPair copy$default(final TouchPair touchPair, Float2 pt0, Float2 pt2, int count, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                pt0 = touchPair.pt0;
            }
            if ((n & 0x2) != 0x0) {
                pt2 = touchPair.pt1;
            }
            if ((n & 0x4) != 0x0) {
                count = touchPair.count;
            }
            return touchPair.copy(pt0, pt2, count);
        }
        
        public final Float2 component1() {
            return this.pt0;
        }
        
        public final Float2 component2() {
            return this.pt1;
        }
        
        public final int component3() {
            return this.count;
        }
        
        public final TouchPair copy(final Float2 float2, final Float2 float3, final int n) {
            e0e.f((Object)float2, "pt0");
            e0e.f((Object)float3, "pt1");
            return new TouchPair(float2, float3, n);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof TouchPair)) {
                return false;
            }
            final TouchPair touchPair = (TouchPair)o;
            return e0e.a((Object)this.pt0, (Object)touchPair.pt0) && e0e.a((Object)this.pt1, (Object)touchPair.pt1) && this.count == touchPair.count;
        }
        
        public final int getCount() {
            return this.count;
        }
        
        public final Float2 getMidpoint() {
            final Float2 pt0 = this.pt0;
            final Float2 pt2 = this.pt1;
            return new Float2(pt2.getX() * 0.5f + pt0.getX() * 0.5f, pt2.getY() * 0.5f + pt0.getY() * 0.5f);
        }
        
        public final Float2 getPt0() {
            return this.pt0;
        }
        
        public final Float2 getPt1() {
            return this.pt1;
        }
        
        public final float getSeparation() {
            final Float2 pt0 = this.pt0;
            final Float2 pt2 = this.pt1;
            final Float2 float2 = new Float2(pt0.getX() - pt2.getX(), pt0.getY() - pt2.getY());
            return (float)Math.sqrt(float2.getY() * float2.getY() + float2.getX() * float2.getX());
        }
        
        public final int getX() {
            return (int)this.getMidpoint().getX();
        }
        
        public final int getY() {
            return (int)this.getMidpoint().getY();
        }
        
        @Override
        public int hashCode() {
            return (this.pt1.hashCode() + this.pt0.hashCode() * 31) * 31 + this.count;
        }
        
        public final void setCount(final int count) {
            this.count = count;
        }
        
        public final void setPt0(final Float2 pt0) {
            e0e.f((Object)pt0, "<set-?>");
            this.pt0 = pt0;
        }
        
        public final void setPt1(final Float2 pt1) {
            e0e.f((Object)pt1, "<set-?>");
            this.pt1 = pt1;
        }
        
        @Override
        public String toString() {
            final StringBuilder f = ehk.f("TouchPair(pt0=");
            f.append(this.pt0);
            f.append(", pt1=");
            f.append(this.pt1);
            f.append(", count=");
            return gwl.x(f, this.count, ')');
        }
    }
}
