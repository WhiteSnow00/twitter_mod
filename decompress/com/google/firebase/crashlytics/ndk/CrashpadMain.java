// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.crashlytics.ndk;

import android.util.Log;

public class CrashpadMain
{
    public static native void crashpadMain(final String[] p0);
    
    public static void main(final String[] array) {
        final String s = array[1];
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("Path to shared objects is ");
            sb.append(s);
            Log.d("FirebaseCrashlytics", sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append("libcrashlytics-handler.so");
            System.load(sb2.toString());
            crashpadMain(array);
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            throw new RuntimeException(unsatisfiedLinkError);
        }
    }
}
