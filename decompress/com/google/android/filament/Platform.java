// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

abstract class Platform
{
    private static Platform mCurrentPlatform;
    
    public Platform() {
    }
    
    public static Platform get() {
        if (Platform.mCurrentPlatform == null) {
            Label_0048: {
                Label_0034: {
                    try {
                        if (!isAndroid()) {
                            break Label_0034;
                        }
                        final int a = AndroidPlatform.a;
                        Platform.mCurrentPlatform = AndroidPlatform.class.newInstance();
                    }
                    catch (final Exception ex) {}
                    break Label_0048;
                }
                Platform.mCurrentPlatform = (Platform)Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
            }
            if (Platform.mCurrentPlatform == null) {
                Platform.mCurrentPlatform = new UnknownPlatform(null);
            }
        }
        return Platform.mCurrentPlatform;
    }
    
    public static boolean isAndroid() {
        return "The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"));
    }
    
    public static boolean isLinux() {
        return System.getProperty("os.name").contains("Linux") && !isAndroid();
    }
    
    public static boolean isMacOS() {
        return System.getProperty("os.name").contains("Mac OS X");
    }
    
    public static boolean isWindows() {
        return System.getProperty("os.name").contains("Windows");
    }
    
    public abstract long getSharedContextNativeHandle(final Object p0);
    
    public abstract void log(final String p0);
    
    public abstract boolean validateSharedContext(final Object p0);
    
    public abstract boolean validateStreamSource(final Object p0);
    
    public abstract boolean validateSurface(final Object p0);
    
    public abstract void warn(final String p0);
    
    public static class UnknownPlatform extends Platform
    {
        private UnknownPlatform() {
        }
        
        @Override
        public long getSharedContextNativeHandle(final Object o) {
            return 0L;
        }
        
        @Override
        public void log(final String s) {
            System.out.println(s);
        }
        
        @Override
        public boolean validateSharedContext(final Object o) {
            return false;
        }
        
        @Override
        public boolean validateStreamSource(final Object o) {
            return false;
        }
        
        @Override
        public boolean validateSurface(final Object o) {
            return false;
        }
        
        @Override
        public void warn(final String s) {
            System.out.println(s);
        }
    }
}
