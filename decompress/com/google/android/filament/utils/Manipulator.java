// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

public class Manipulator
{
    private static final Mode[] sModeValues;
    private final long mNativeObject;
    
    static {
        sModeValues = Mode.values();
    }
    
    private Manipulator(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    public Manipulator(final long n, final Manipulator$1 object) {
        this(n);
    }
    
    public static long access$000() {
        return nCreateBuilder();
    }
    
    public static void access$100(final long n, final int n2, final int n3) {
        nBuilderViewport(n, n2, n3);
    }
    
    public static void access$1000(final long n, final float n2, final float n3) {
        nBuilderMapExtent(n, n2, n3);
    }
    
    public static void access$1100(final long n, final float n2) {
        nBuilderMapMinDistance(n, n2);
    }
    
    public static void access$1200(final long n, final float n2, final float n3, final float n4) {
        nBuilderFlightStartPosition(n, n2, n3, n4);
    }
    
    public static void access$1300(final long n, final float n2, final float n3) {
        nBuilderFlightStartOrientation(n, n2, n3);
    }
    
    public static void access$1400(final long n, final float n2) {
        nBuilderFlightMaxMoveSpeed(n, n2);
    }
    
    public static void access$1500(final long n, final int n2) {
        nBuilderFlightSpeedSteps(n, n2);
    }
    
    public static void access$1600(final long n, final float n2, final float n3) {
        nBuilderFlightPanSpeed(n, n2, n3);
    }
    
    public static void access$1700(final long n, final float n2) {
        nBuilderFlightMoveDamping(n, n2);
    }
    
    public static void access$1800(final long n, final float n2, final float n3, final float n4, final float n5) {
        nBuilderGroundPlane(n, n2, n3, n4, n5);
    }
    
    public static long access$1900(final long n, final int n2) {
        return nBuilderBuild(n, n2);
    }
    
    public static void access$200(final long n, final float n2, final float n3, final float n4) {
        nBuilderTargetPosition(n, n2, n3, n4);
    }
    
    public static void access$2100(final long n) {
        nDestroyBuilder(n);
    }
    
    public static void access$300(final long n, final float n2, final float n3, final float n4) {
        nBuilderUpVector(n, n2, n3, n4);
    }
    
    public static void access$400(final long n, final float n2) {
        nBuilderZoomSpeed(n, n2);
    }
    
    public static void access$500(final long n, final float n2, final float n3, final float n4) {
        nBuilderOrbitHomePosition(n, n2, n3, n4);
    }
    
    public static void access$600(final long n, final float n2, final float n3) {
        nBuilderOrbitSpeed(n, n2, n3);
    }
    
    public static void access$700(final long n, final int n2) {
        nBuilderFovDirection(n, n2);
    }
    
    public static void access$800(final long n, final float n2) {
        nBuilderFovDegrees(n, n2);
    }
    
    public static void access$900(final long n, final float n2) {
        nBuilderFarPlane(n, n2);
    }
    
    private static native long nBuilderBuild(final long p0, final int p1);
    
    private static native void nBuilderFarPlane(final long p0, final float p1);
    
    private static native void nBuilderFlightMaxMoveSpeed(final long p0, final float p1);
    
    private static native void nBuilderFlightMoveDamping(final long p0, final float p1);
    
    private static native void nBuilderFlightPanSpeed(final long p0, final float p1, final float p2);
    
    private static native void nBuilderFlightSpeedSteps(final long p0, final int p1);
    
    private static native void nBuilderFlightStartOrientation(final long p0, final float p1, final float p2);
    
    private static native void nBuilderFlightStartPosition(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nBuilderFovDegrees(final long p0, final float p1);
    
    private static native void nBuilderFovDirection(final long p0, final int p1);
    
    private static native void nBuilderGroundPlane(final long p0, final float p1, final float p2, final float p3, final float p4);
    
    private static native void nBuilderMapExtent(final long p0, final float p1, final float p2);
    
    private static native void nBuilderMapMinDistance(final long p0, final float p1);
    
    private static native void nBuilderOrbitHomePosition(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nBuilderOrbitSpeed(final long p0, final float p1, final float p2);
    
    private static native void nBuilderTargetPosition(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nBuilderUpVector(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nBuilderViewport(final long p0, final int p1, final int p2);
    
    private static native void nBuilderZoomSpeed(final long p0, final float p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native void nDestroyManipulator(final long p0);
    
    private static native long nGetCurrentBookmark(final long p0);
    
    private static native long nGetHomeBookmark(final long p0);
    
    private static native void nGetLookAtDouble(final long p0, final double[] p1, final double[] p2, final double[] p3);
    
    private static native void nGetLookAtFloat(final long p0, final float[] p1, final float[] p2, final float[] p3);
    
    private static native int nGetMode(final long p0);
    
    private static native void nGrabBegin(final long p0, final int p1, final int p2, final boolean p3);
    
    private static native void nGrabEnd(final long p0);
    
    private static native void nGrabUpdate(final long p0, final int p1, final int p2);
    
    private static native void nJumpToBookmark(final long p0, final long p1);
    
    private static native void nKeyDown(final long p0, final int p1);
    
    private static native void nKeyUp(final long p0, final int p1);
    
    private static native void nRaycast(final long p0, final int p1, final int p2, final float[] p3);
    
    private static native void nScroll(final long p0, final int p1, final int p2, final float p3);
    
    private static native void nSetViewport(final long p0, final int p1, final int p2);
    
    private static native void nUpdate(final long p0, final float p1);
    
    public void finalize() {
        while (true) {
            try {
                super.finalize();
                nDestroyManipulator(this.mNativeObject);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public Bookmark getCurrentBookmark() {
        return new Bookmark(nGetCurrentBookmark(this.mNativeObject));
    }
    
    public Bookmark getHomeBookmark() {
        return new Bookmark(nGetHomeBookmark(this.mNativeObject));
    }
    
    public void getLookAt(final double[] array, final double[] array2, final double[] array3) {
        nGetLookAtDouble(this.mNativeObject, array, array2, array3);
    }
    
    public void getLookAt(final float[] array, final float[] array2, final float[] array3) {
        nGetLookAtFloat(this.mNativeObject, array, array2, array3);
    }
    
    public Mode getMode() {
        return Manipulator.sModeValues[nGetMode(this.mNativeObject)];
    }
    
    public void grabBegin(final int n, final int n2, final boolean b) {
        nGrabBegin(this.mNativeObject, n, n2, b);
    }
    
    public void grabEnd() {
        nGrabEnd(this.mNativeObject);
    }
    
    public void grabUpdate(final int n, final int n2) {
        nGrabUpdate(this.mNativeObject, n, n2);
    }
    
    public void jumpToBookmark(final Bookmark bookmark) {
        nJumpToBookmark(this.mNativeObject, bookmark.getNativeObject());
    }
    
    public void keyDown(final Key key) {
        nKeyDown(this.mNativeObject, key.ordinal());
    }
    
    public void keyUp(final Key key) {
        nKeyUp(this.mNativeObject, key.ordinal());
    }
    
    public float[] raycast(final int n, final int n2) {
        final float[] array = new float[3];
        nRaycast(this.mNativeObject, n, n2, array);
        return array;
    }
    
    public void scroll(final int n, final int n2, final float n3) {
        nScroll(this.mNativeObject, n, n2, n3);
    }
    
    public void setViewport(final int n, final int n2) {
        nSetViewport(this.mNativeObject, n, n2);
    }
    
    public void update(final float n) {
        nUpdate(this.mNativeObject, n);
    }
    
    public static class Builder
    {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        
        public Builder() {
            final long access$000 = Manipulator.access$000();
            this.mNativeBuilder = access$000;
            this.mFinalizer = new BuilderFinalizer(access$000);
        }
        
        public Manipulator build(final Mode mode) {
            final long access$1900 = Manipulator.access$1900(this.mNativeBuilder, mode.ordinal());
            if (access$1900 != 0L) {
                return new Manipulator(access$1900, null);
            }
            throw new IllegalStateException("Couldn't create Manipulator");
        }
        
        public Builder farPlane(final float n) {
            Manipulator.access$900(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder flightMaxMoveSpeed(final float n) {
            Manipulator.access$1400(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder flightMoveDamping(final float n) {
            Manipulator.access$1700(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder flightPanSpeed(final float n, final float n2) {
            Manipulator.access$1600(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder flightSpeedSteps(final int n) {
            Manipulator.access$1500(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder flightStartOrientation(final float n, final float n2) {
            Manipulator.access$1300(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder flightStartPosition(final float n, final float n2, final float n3) {
            Manipulator.access$1200(this.mNativeBuilder, n, n2, n3);
            return this;
        }
        
        public Builder fovDegrees(final float n) {
            Manipulator.access$800(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder fovDirection(final Fov fov) {
            Manipulator.access$700(this.mNativeBuilder, fov.ordinal());
            return this;
        }
        
        public Builder groundPlane(final float n, final float n2, final float n3, final float n4) {
            Manipulator.access$1800(this.mNativeBuilder, n, n2, n3, n4);
            return this;
        }
        
        public Builder mapExtent(final float n, final float n2) {
            Manipulator.access$1000(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder mapMinDistance(final float n) {
            Manipulator.access$1100(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder orbitHomePosition(final float n, final float n2, final float n3) {
            Manipulator.access$500(this.mNativeBuilder, n, n2, n3);
            return this;
        }
        
        public Builder orbitSpeed(final float n, final float n2) {
            Manipulator.access$600(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder targetPosition(final float n, final float n2, final float n3) {
            Manipulator.access$200(this.mNativeBuilder, n, n2, n3);
            return this;
        }
        
        public Builder upVector(final float n, final float n2, final float n3) {
            Manipulator.access$300(this.mNativeBuilder, n, n2, n3);
            return this;
        }
        
        public Builder viewport(final int n, final int n2) {
            Manipulator.access$100(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder zoomSpeed(final float n) {
            Manipulator.access$400(this.mNativeBuilder, n);
            return this;
        }
        
        public static class BuilderFinalizer
        {
            private final long mNativeObject;
            
            public BuilderFinalizer(final long mNativeObject) {
                this.mNativeObject = mNativeObject;
            }
            
            public void finalize() {
                while (true) {
                    try {
                        super.finalize();
                        Manipulator.access$2100(this.mNativeObject);
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public enum Fov
    {
        private static final Fov[] $VALUES;
        
        HORIZONTAL, 
        VERTICAL;
    }
    
    public enum Key
    {
        private static final Key[] $VALUES;
        
        BACKWARD, 
        DOWN, 
        FORWARD, 
        LEFT, 
        RIGHT, 
        UP;
    }
    
    public enum Mode
    {
        private static final Mode[] $VALUES;
        
        FREE_FLIGHT, 
        MAP, 
        ORBIT;
    }
}
