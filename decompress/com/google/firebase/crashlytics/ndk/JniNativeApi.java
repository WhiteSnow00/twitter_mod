// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.crashlytics.ndk;

import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import java.util.ArrayList;
import android.os.Build;
import android.content.res.AssetManager;
import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import java.io.FilenameFilter;
import java.io.File;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.Collections;
import android.content.pm.PackageInfo;
import java.util.List;
import android.util.Log;
import android.content.Context;

class JniNativeApi implements k9i
{
    public static final boolean b;
    public final Context a;
    
    static {
        boolean b2;
        try {
            System.loadLibrary("crashlytics");
            b2 = true;
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            final StringBuilder j = fu8.j("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n");
            j.append(unsatisfiedLinkError.getLocalizedMessage());
            Log.e("FirebaseCrashlytics", j.toString(), (Throwable)null);
            b2 = false;
        }
        b = b2;
    }
    
    public JniNativeApi(final Context a) {
        this.a = a;
    }
    
    @TargetApi(21)
    public static void a(final List<String> list, final PackageInfo packageInfo) {
        final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        final String[] splitSourceDirs = applicationInfo.splitSourceDirs;
        if (splitSourceDirs != null) {
            Collections.addAll(list, splitSourceDirs);
        }
        final String dataDir = applicationInfo.dataDir;
        String s;
        if (Build$VERSION.SDK_INT >= 28) {
            s = Long.toString(packageInfo.getLongVersionCode());
        }
        else {
            s = Integer.toString(packageInfo.versionCode);
        }
        int i = 0;
        final File file = new File(dataDir, String.format("files/splitcompat/%s/verified-splits", s));
        if (!file.exists()) {
            final StringBuilder j = fu8.j("No dynamic features found at ");
            j.append(file.getAbsolutePath());
            final String string = j.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, (Throwable)null);
            }
            return;
        }
        File[] listFiles;
        if ((listFiles = file.listFiles((FilenameFilter)c.a)) == null) {
            listFiles = new File[0];
        }
        final StringBuilder k = fu8.j("Found ");
        k.append(listFiles.length);
        k.append(" APKs in ");
        k.append(file.getAbsolutePath());
        final String string2 = k.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string2, (Throwable)null);
        }
        while (i < listFiles.length) {
            final File file2 = listFiles[i];
            final StringBuilder l = fu8.j("Adding ");
            l.append(file2.getName());
            l.append(" to classpath.");
            final String string3 = l.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string3, (Throwable)null);
            }
            list.add(file2.getAbsolutePath());
            ++i;
        }
    }
    
    private native boolean nativeInit(final String[] p0, final Object p1);
    
    public final boolean b(final String s, final AssetManager assetManager) {
        final String cpu_ABI = Build.CPU_ABI;
        try {
            final PackageManager packageManager = this.a.getPackageManager();
            final String packageName = this.a.getPackageName();
            int n;
            if (Build$VERSION.SDK_INT >= 24) {
                n = 9216;
            }
            else {
                n = 1024;
            }
            final PackageInfo packageInfo = packageManager.getPackageInfo(packageName, n);
            final ArrayList<Object> list = new ArrayList<Object>(10);
            list.add(packageInfo.applicationInfo.sourceDir);
            a((List<String>)list, packageInfo);
            final String[] sharedLibraryFiles = packageInfo.applicationInfo.sharedLibraryFiles;
            if (sharedLibraryFiles != null) {
                Collections.addAll(list, sharedLibraryFiles);
            }
            final ArrayList<String> list2 = new ArrayList<String>(10);
            final File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                list2.add(new File(parentFile, cpu_ABI).getPath());
                if (cpu_ABI.startsWith("arm64")) {
                    list2.add(new File(parentFile, "arm64").getPath());
                }
                else if (cpu_ABI.startsWith("arm")) {
                    list2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (final String s2 : list) {
                if (s2.endsWith(".apk")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s2);
                    sb.append("!/lib/");
                    sb.append(cpu_ABI);
                    list2.add(sb.toString());
                }
            }
            list2.add(System.getProperty("java.library.path"));
            list2.add(packageInfo.applicationInfo.nativeLibraryDir);
            final String[] array = new String[2];
            final String pathSeparator = File.pathSeparator;
            final String join = TextUtils.join((CharSequence)pathSeparator, (Iterable)list);
            final boolean b = false;
            array[0] = join;
            array[1] = TextUtils.join((CharSequence)pathSeparator, (Iterable)list2);
            final String s3 = array[0];
            final String s4 = array[1];
            boolean b2 = b;
            if (JniNativeApi.b) {
                b2 = b;
                if (this.nativeInit(new String[] { s3, s4, s }, assetManager)) {
                    b2 = true;
                }
            }
            return b2;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.e("FirebaseCrashlytics", "Unable to compose package paths", (Throwable)ex);
            throw new RuntimeException((Throwable)ex);
        }
    }
}
