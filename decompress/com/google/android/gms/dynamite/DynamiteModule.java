// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.dynamite;

import com.google.android.gms.common.util.DynamiteApi;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import android.os.IBinder;
import android.content.ContentResolver;
import android.net.Uri$Builder;
import android.os.Parcel;
import android.database.Cursor;
import android.os.RemoteException;
import android.os.SystemClock;
import java.lang.reflect.Field;
import android.util.Log;
import java.util.Objects;
import android.content.Context;

public final class DynamiteModule
{
    public static final b b;
    public static final c c;
    public static final d d;
    public static final e e;
    public static Boolean f;
    public static String g;
    public static boolean h = false;
    public static int i = -1;
    public static final ThreadLocal<vrz> j;
    public static final ThreadLocal<Long> k;
    public static final com.google.android.gms.dynamite.a l;
    public static nwz m;
    public static oxz n;
    public final Context a;
    
    static {
        j = new ThreadLocal<vrz>();
        DynamiteModule.k = new wsy();
        l = new com.google.android.gms.dynamite.a();
        b = new b();
        c = new c();
        d = new d();
        e = new e();
    }
    
    public DynamiteModule(final Context a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
    }
    
    public static int a(final Context context, final String s) {
        try {
            final ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(s);
            sb.append(".");
            sb.append("ModuleDescriptor");
            final Class<?> loadClass = classLoader.loadClass(sb.toString());
            final Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            final Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!f5j.a(declaredField.get(null), s)) {
                final String value = String.valueOf(declaredField.get(null));
                final StringBuilder sb2 = new StringBuilder(value.length() + 51 + String.valueOf(s).length());
                sb2.append("Module descriptor id '");
                sb2.append(value);
                sb2.append("' didn't match expected id '");
                sb2.append(s);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        }
        catch (final Exception ex) {
            final String value2 = String.valueOf(ex.getMessage());
            String concat;
            if (value2.length() != 0) {
                concat = "Failed to load module descriptor class: ".concat(value2);
            }
            else {
                concat = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", concat);
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb3 = new StringBuilder(String.valueOf(s).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(s);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
        }
        return 0;
    }
    
    public static DynamiteModule c(Context context, a a, final String s) throws LoadingException {
        final ThreadLocal<vrz> j = DynamiteModule.j;
        final vrz vrz = j.get();
        final vrz vrz2 = new vrz((uoz)null);
        j.set(vrz2);
        final wsy k = DynamiteModule.k;
        final long longValue = ((ThreadLocal<Long>)k).get();
        try {
            ((ThreadLocal<Long>)k).set(Long.valueOf(SystemClock.elapsedRealtime()));
            final a.b a2 = a.a(context, s, (a.a)DynamiteModule.l);
            final int a3 = a2.a;
            final int b = a2.b;
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 68 + String.valueOf(s).length());
            sb.append("Considering local module ");
            sb.append(s);
            sb.append(":");
            sb.append(a3);
            sb.append(" and remote module ");
            sb.append(s);
            sb.append(":");
            sb.append(b);
            Log.i("DynamiteModule", sb.toString());
            final int c = a2.c;
            Label_1346: {
                if (c == 0) {
                    break Label_1346;
                }
                int n;
                if ((n = c) == -1) {
                    if (a2.a == 0) {
                        break Label_1346;
                    }
                    n = -1;
                }
                if (n == 1 && a2.b == 0) {
                    break Label_1346;
                }
                if (n == -1) {
                    final DynamiteModule f = f(context, s);
                    if (longValue == 0L) {
                        ((ThreadLocal)k).remove();
                    }
                    else {
                        ((ThreadLocal<Long>)k).set(Long.valueOf(longValue));
                    }
                    final Cursor a4 = vrz2.a;
                    if (a4 != null) {
                        a4.close();
                    }
                    j.set(vrz);
                    return f;
                }
                Label_1308: {
                    if (n != 1) {
                        break Label_1308;
                    }
                    try {
                        final int b2 = a2.b;
                        try {
                            synchronized (DynamiteModule.class) {
                                final Boolean f2 = DynamiteModule.f;
                                monitorexit(DynamiteModule.class);
                                if (f2 != null) {
                                    Label_0968: {
                                        if (f2) {
                                            final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 51);
                                            sb2.append("Selected remote version of ");
                                            sb2.append(s);
                                            sb2.append(", version >= ");
                                            sb2.append(b2);
                                            Log.i("DynamiteModule", sb2.toString());
                                            synchronized (DynamiteModule.class) {
                                                final oxz n2 = DynamiteModule.n;
                                                monitorexit(DynamiteModule.class);
                                                if (n2 != null) {
                                                    final vrz vrz3 = j.get();
                                                    if (vrz3 != null && vrz3.a != null) {
                                                        final Context applicationContext = context.getApplicationContext();
                                                        final Cursor a5 = vrz3.a;
                                                        d5j.D1();
                                                        synchronized (DynamiteModule.class) {
                                                            final boolean b3 = DynamiteModule.i >= 2;
                                                            monitorexit(DynamiteModule.class);
                                                            l2d l2d;
                                                            if ((boolean)b3) {
                                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                                l2d = n2.D1((l2d)new d5j((Object)applicationContext), s, b2, (l2d)new d5j((Object)a5));
                                                            }
                                                            else {
                                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                l2d = n2.U0((l2d)new d5j((Object)applicationContext), s, b2, (l2d)new d5j((Object)a5));
                                                            }
                                                            final Context context2 = (Context)d5j.U0(l2d);
                                                            if (context2 != null) {
                                                                context = (Context)new DynamiteModule(context2);
                                                                break Label_0968;
                                                            }
                                                            throw new LoadingException("Failed to get module context");
                                                        }
                                                    }
                                                    throw new LoadingException("No result cursor");
                                                }
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                            }
                                        }
                                        final StringBuilder sb3 = new StringBuilder(String.valueOf(s).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(s);
                                        sb3.append(", version >= ");
                                        sb3.append(b2);
                                        Log.i("DynamiteModule", sb3.toString());
                                        final nwz h = h(context);
                                        if (h == null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                        final Parcel s2 = ((p8y)h).s(6, ((p8y)h).x());
                                        final int int1 = s2.readInt();
                                        s2.recycle();
                                        l2d l2d2;
                                        if (int1 >= 3) {
                                            final vrz vrz4 = j.get();
                                            if (vrz4 == null) {
                                                throw new LoadingException("No cached result cursor holder");
                                            }
                                            l2d2 = h.D1((l2d)new d5j((Object)context), s, b2, (l2d)new d5j((Object)vrz4.a));
                                        }
                                        else if (int1 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            l2d2 = h.V1((l2d)new d5j((Object)context), s, b2);
                                        }
                                        else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            l2d2 = h.U0((l2d)new d5j((Object)context), s, b2);
                                        }
                                        if (d5j.U0(l2d2) == null) {
                                            throw new LoadingException("Failed to load remote module.");
                                        }
                                        context = (Context)new DynamiteModule((Context)d5j.U0(l2d2));
                                    }
                                    if (longValue == 0L) {
                                        ((ThreadLocal)k).remove();
                                    }
                                    else {
                                        ((ThreadLocal<Long>)k).set(Long.valueOf(longValue));
                                    }
                                    a = (a)vrz2.a;
                                    if (a != null) {
                                        ((Cursor)a).close();
                                    }
                                    j.set(vrz);
                                    return (DynamiteModule)context;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.");
                            }
                        }
                        catch (final LoadingException ex) {
                            throw ex;
                        }
                        catch (final RemoteException ex3) {
                            try {
                                throw new LoadingException("Failed to load remote module.", (Throwable)ex3);
                            }
                            catch (final LoadingException ex4) {
                                final String value = String.valueOf(ex4.getMessage());
                                String concat;
                                if (value.length() != 0) {
                                    concat = "Failed to load remote module: ".concat(value);
                                }
                                else {
                                    concat = new String("Failed to load remote module: ");
                                }
                                Log.w("DynamiteModule", concat);
                                final int a6 = a2.a;
                                if (a6 != 0 && a.a(context, s, (a.a)new f(a6)).c == -1) {
                                    return f(context, s);
                                }
                                throw new LoadingException("Remote load failed. No local fallback found.", ex4);
                                final StringBuilder sb4 = new StringBuilder(47);
                                sb4.append("VersionPolicy returned invalid code:");
                                sb4.append(n);
                                throw new LoadingException(sb4.toString());
                                final int a7 = a2.a;
                                final int b4 = a2.b;
                                final StringBuilder sb5 = new StringBuilder(String.valueOf(s).length() + 92);
                                sb5.append("No acceptable module ");
                                sb5.append(s);
                                sb5.append(" found. Local version is ");
                                sb5.append(a7);
                                sb5.append(" and remote version is ");
                                sb5.append(b4);
                                sb5.append(".");
                                throw new LoadingException(sb5.toString());
                            }
                        }
                        finally {
                            try {
                                Objects.requireNonNull(context, "null reference");
                            }
                            catch (final Exception ex5) {
                                Log.e("CrashUtils", "Error adding exception to DropBox!", (Throwable)ex5);
                            }
                            final Throwable t;
                            throw new LoadingException("Failed to load remote module.", t);
                        }
                        try {
                            final LoadingException ex;
                            throw ex;
                        }
                        catch (final LoadingException ex6) {}
                        finally {
                            if (longValue == 0L) {
                                ((ThreadLocal)DynamiteModule.k).remove();
                            }
                            else {
                                ((ThreadLocal<Long>)DynamiteModule.k).set(Long.valueOf(longValue));
                            }
                            final Cursor a8 = vrz2.a;
                            if (a8 != null) {
                                a8.close();
                            }
                            DynamiteModule.j.set(vrz);
                        }
                    }
                    catch (final LoadingException ex7) {}
                }
            }
        }
        finally {}
    }
    
    public static int d(final Context p0, final String p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/google/android/gms/dynamite/DynamiteModule.f:Ljava/lang/Boolean;
        //     6: astore          11
        //     8: aconst_null    
        //     9: astore          8
        //    11: aconst_null    
        //    12: astore          9
        //    14: aconst_null    
        //    15: astore          10
        //    17: aload           11
        //    19: astore          7
        //    21: aload           11
        //    23: ifnonnull       391
        //    26: aload_0        
        //    27: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    30: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    33: ldc             Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;.class
        //    35: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    38: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    41: ldc_w           "sClassLoader"
        //    44: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    47: astore          12
        //    49: aload           12
        //    51: invokevirtual   java/lang/reflect/Field.getDeclaringClass:()Ljava/lang/Class;
        //    54: astore          11
        //    56: aload           11
        //    58: monitorenter   
        //    59: aload           12
        //    61: aconst_null    
        //    62: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    65: checkcast       Ljava/lang/ClassLoader;
        //    68: astore          7
        //    70: aload           7
        //    72: ifnull          104
        //    75: aload           7
        //    77: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //    80: if_acmpne       91
        //    83: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    86: astore          7
        //    88: goto            300
        //    91: aload           7
        //    93: invokestatic    com/google/android/gms/dynamite/DynamiteModule.g:(Ljava/lang/ClassLoader;)V
        //    96: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    99: astore          7
        //   101: goto            300
        //   104: getstatic       com/google/android/gms/dynamite/DynamiteModule.h:Z
        //   107: ifne            286
        //   110: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   113: astore          13
        //   115: aload           13
        //   117: aconst_null    
        //   118: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //   121: istore          6
        //   123: iload           6
        //   125: ifeq            131
        //   128: goto            286
        //   131: aload_0        
        //   132: aload_1        
        //   133: iload_2        
        //   134: invokestatic    com/google/android/gms/dynamite/DynamiteModule.e:(Landroid/content/Context;Ljava/lang/String;Z)I
        //   137: istore_3       
        //   138: getstatic       com/google/android/gms/dynamite/DynamiteModule.g:Ljava/lang/String;
        //   141: astore          7
        //   143: aload           7
        //   145: ifnull          259
        //   148: aload           7
        //   150: invokevirtual   java/lang/String.isEmpty:()Z
        //   153: ifeq            159
        //   156: goto            259
        //   159: invokestatic    wiy.Z:()Ljava/lang/ClassLoader;
        //   162: astore          7
        //   164: aload           7
        //   166: ifnull          172
        //   169: goto            233
        //   172: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   175: bipush          29
        //   177: if_icmplt       208
        //   180: getstatic       com/google/android/gms/dynamite/DynamiteModule.g:Ljava/lang/String;
        //   183: astore          7
        //   185: aload           7
        //   187: invokestatic    eli.q:(Ljava/lang/Object;)Ljava/lang/Object;
        //   190: pop            
        //   191: new             Ldalvik/system/DelegateLastClassLoader;
        //   194: dup            
        //   195: aload           7
        //   197: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   200: invokespecial   dalvik/system/DelegateLastClassLoader.<init>:(Ljava/lang/String;Ljava/lang/ClassLoader;)V
        //   203: astore          7
        //   205: goto            233
        //   208: getstatic       com/google/android/gms/dynamite/DynamiteModule.g:Ljava/lang/String;
        //   211: astore          7
        //   213: aload           7
        //   215: invokestatic    eli.q:(Ljava/lang/Object;)Ljava/lang/Object;
        //   218: pop            
        //   219: new             Laoy;
        //   222: dup            
        //   223: aload           7
        //   225: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   228: invokespecial   aoy.<init>:(Ljava/lang/String;Ljava/lang/ClassLoader;)V
        //   231: astore          7
        //   233: aload           7
        //   235: invokestatic    com/google/android/gms/dynamite/DynamiteModule.g:(Ljava/lang/ClassLoader;)V
        //   238: aload           12
        //   240: aconst_null    
        //   241: aload           7
        //   243: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   246: aload           13
        //   248: putstatic       com/google/android/gms/dynamite/DynamiteModule.f:Ljava/lang/Boolean;
        //   251: aload           11
        //   253: monitorexit    
        //   254: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   256: monitorexit    
        //   257: iload_3        
        //   258: ireturn        
        //   259: aload           11
        //   261: monitorexit    
        //   262: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   264: monitorexit    
        //   265: iload_3        
        //   266: ireturn        
        //   267: astore          7
        //   269: aload           12
        //   271: aconst_null    
        //   272: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   275: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   278: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   281: astore          7
        //   283: goto            300
        //   286: aload           12
        //   288: aconst_null    
        //   289: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   292: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   295: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   298: astore          7
        //   300: aload           11
        //   302: monitorexit    
        //   303: goto            386
        //   306: astore          7
        //   308: aload           11
        //   310: monitorexit    
        //   311: aload           7
        //   313: athrow         
        //   314: astore          7
        //   316: goto            326
        //   319: astore          7
        //   321: goto            326
        //   324: astore          7
        //   326: aload           7
        //   328: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   331: astore          7
        //   333: aload           7
        //   335: invokevirtual   java/lang/String.length:()I
        //   338: istore_3       
        //   339: new             Ljava/lang/StringBuilder;
        //   342: astore          11
        //   344: aload           11
        //   346: iload_3        
        //   347: bipush          30
        //   349: iadd           
        //   350: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   353: aload           11
        //   355: ldc_w           "Failed to load module via V2: "
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: pop            
        //   362: aload           11
        //   364: aload           7
        //   366: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   369: pop            
        //   370: ldc             "DynamiteModule"
        //   372: aload           11
        //   374: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   377: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   380: pop            
        //   381: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   384: astore          7
        //   386: aload           7
        //   388: putstatic       com/google/android/gms/dynamite/DynamiteModule.f:Ljava/lang/Boolean;
        //   391: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   393: monitorexit    
        //   394: aload           7
        //   396: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   399: istore          6
        //   401: iconst_0       
        //   402: istore_3       
        //   403: iconst_0       
        //   404: istore          5
        //   406: iload           6
        //   408: ifeq            467
        //   411: aload_0        
        //   412: aload_1        
        //   413: iload_2        
        //   414: invokestatic    com/google/android/gms/dynamite/DynamiteModule.e:(Landroid/content/Context;Ljava/lang/String;Z)I
        //   417: istore_2       
        //   418: iload_2        
        //   419: ireturn        
        //   420: astore_1       
        //   421: aload_1        
        //   422: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   425: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   428: astore_1       
        //   429: aload_1        
        //   430: invokevirtual   java/lang/String.length:()I
        //   433: ifeq            447
        //   436: ldc_w           "Failed to retrieve remote module version: "
        //   439: aload_1        
        //   440: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   443: astore_1       
        //   444: goto            458
        //   447: new             Ljava/lang/String;
        //   450: dup            
        //   451: ldc_w           "Failed to retrieve remote module version: "
        //   454: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   457: astore_1       
        //   458: ldc             "DynamiteModule"
        //   460: aload_1        
        //   461: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   464: pop            
        //   465: iconst_0       
        //   466: ireturn        
        //   467: aload_0        
        //   468: invokestatic    com/google/android/gms/dynamite/DynamiteModule.h:(Landroid/content/Context;)Lnwz;
        //   471: astore          11
        //   473: aload           11
        //   475: ifnonnull       483
        //   478: iload_3        
        //   479: istore_2       
        //   480: goto            1084
        //   483: aload           8
        //   485: astore          7
        //   487: aload           11
        //   489: bipush          6
        //   491: aload           11
        //   493: invokevirtual   p8y.x:()Landroid/os/Parcel;
        //   496: invokevirtual   p8y.s:(ILandroid/os/Parcel;)Landroid/os/Parcel;
        //   499: astore          12
        //   501: aload           8
        //   503: astore          7
        //   505: aload           12
        //   507: invokevirtual   android/os/Parcel.readInt:()I
        //   510: istore          4
        //   512: aload           8
        //   514: astore          7
        //   516: aload           12
        //   518: invokevirtual   android/os/Parcel.recycle:()V
        //   521: iload           4
        //   523: iconst_3       
        //   524: if_icmplt       774
        //   527: aload           8
        //   529: astore          7
        //   531: getstatic       com/google/android/gms/dynamite/DynamiteModule.j:Ljava/lang/ThreadLocal;
        //   534: astore          12
        //   536: aload           8
        //   538: astore          7
        //   540: aload           12
        //   542: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   545: checkcast       Lvrz;
        //   548: astore          13
        //   550: aload           13
        //   552: ifnull          587
        //   555: aload           8
        //   557: astore          7
        //   559: aload           13
        //   561: getfield        vrz.a:Landroid/database/Cursor;
        //   564: astore          13
        //   566: aload           13
        //   568: ifnull          587
        //   571: aload           8
        //   573: astore          7
        //   575: aload           13
        //   577: iconst_0       
        //   578: invokeinterface android/database/Cursor.getInt:(I)I
        //   583: istore_2       
        //   584: goto            1084
        //   587: aload           8
        //   589: astore          7
        //   591: new             Ld5j;
        //   594: astore          13
        //   596: aload           8
        //   598: astore          7
        //   600: aload           13
        //   602: aload_0        
        //   603: invokespecial   d5j.<init>:(Ljava/lang/Object;)V
        //   606: aload           8
        //   608: astore          7
        //   610: aload           11
        //   612: aload           13
        //   614: aload_1        
        //   615: iload_2        
        //   616: getstatic       com/google/android/gms/dynamite/DynamiteModule.k:Lwsy;
        //   619: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   622: checkcast       Ljava/lang/Long;
        //   625: invokevirtual   java/lang/Long.longValue:()J
        //   628: invokevirtual   nwz.W1:(Ll2d;Ljava/lang/String;ZJ)Ll2d;
        //   631: invokestatic    d5j.U0:(Ll2d;)Ljava/lang/Object;
        //   634: checkcast       Landroid/database/Cursor;
        //   637: astore_1       
        //   638: aload_1        
        //   639: ifnull          734
        //   642: aload_1        
        //   643: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   648: ifne            654
        //   651: goto            734
        //   654: aload_1        
        //   655: iconst_0       
        //   656: invokeinterface android/database/Cursor.getInt:(I)I
        //   661: istore          4
        //   663: iload           4
        //   665: ifle            715
        //   668: aload           12
        //   670: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   673: checkcast       Lvrz;
        //   676: astore          7
        //   678: iload           5
        //   680: istore_2       
        //   681: aload           7
        //   683: ifnull          705
        //   686: iload           5
        //   688: istore_2       
        //   689: aload           7
        //   691: getfield        vrz.a:Landroid/database/Cursor;
        //   694: ifnonnull       705
        //   697: aload           7
        //   699: aload_1        
        //   700: putfield        vrz.a:Landroid/database/Cursor;
        //   703: iconst_1       
        //   704: istore_2       
        //   705: iload_2        
        //   706: ifeq            715
        //   709: aload           10
        //   711: astore_1       
        //   712: goto            715
        //   715: iload           4
        //   717: istore_2       
        //   718: aload_1        
        //   719: ifnull          991
        //   722: aload_1        
        //   723: invokeinterface android/database/Cursor.close:()V
        //   728: iload           4
        //   730: istore_2       
        //   731: goto            991
        //   734: ldc             "DynamiteModule"
        //   736: ldc_w           "Failed to retrieve remote module version."
        //   739: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   742: pop            
        //   743: iload_3        
        //   744: istore_2       
        //   745: aload_1        
        //   746: ifnull          1084
        //   749: aload_1        
        //   750: invokeinterface android/database/Cursor.close:()V
        //   755: iload_3        
        //   756: istore_2       
        //   757: goto            1084
        //   760: astore          7
        //   762: goto            1093
        //   765: astore          7
        //   767: aload           7
        //   769: astore          8
        //   771: goto            1004
        //   774: iload           4
        //   776: iconst_2       
        //   777: if_icmpne       887
        //   780: aload           8
        //   782: astore          7
        //   784: ldc             "DynamiteModule"
        //   786: ldc_w           "IDynamite loader version = 2, no high precision latency measurement."
        //   789: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   792: pop            
        //   793: aload           8
        //   795: astore          7
        //   797: new             Ld5j;
        //   800: astore          10
        //   802: aload           8
        //   804: astore          7
        //   806: aload           10
        //   808: aload_0        
        //   809: invokespecial   d5j.<init>:(Ljava/lang/Object;)V
        //   812: aload           8
        //   814: astore          7
        //   816: aload           11
        //   818: invokevirtual   p8y.x:()Landroid/os/Parcel;
        //   821: astore          12
        //   823: aload           8
        //   825: astore          7
        //   827: aload           12
        //   829: aload           10
        //   831: invokestatic    gny.b:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   834: aload           8
        //   836: astore          7
        //   838: aload           12
        //   840: aload_1        
        //   841: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   844: aload           8
        //   846: astore          7
        //   848: aload           12
        //   850: iload_2        
        //   851: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   854: aload           8
        //   856: astore          7
        //   858: aload           11
        //   860: iconst_5       
        //   861: aload           12
        //   863: invokevirtual   p8y.s:(ILandroid/os/Parcel;)Landroid/os/Parcel;
        //   866: astore_1       
        //   867: aload           8
        //   869: astore          7
        //   871: aload_1        
        //   872: invokevirtual   android/os/Parcel.readInt:()I
        //   875: istore_2       
        //   876: aload           8
        //   878: astore          7
        //   880: aload_1        
        //   881: invokevirtual   android/os/Parcel.recycle:()V
        //   884: goto            991
        //   887: aload           8
        //   889: astore          7
        //   891: ldc             "DynamiteModule"
        //   893: ldc_w           "IDynamite loader version < 2, falling back to getModuleVersion2"
        //   896: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   899: pop            
        //   900: aload           8
        //   902: astore          7
        //   904: new             Ld5j;
        //   907: astore          12
        //   909: aload           8
        //   911: astore          7
        //   913: aload           12
        //   915: aload_0        
        //   916: invokespecial   d5j.<init>:(Ljava/lang/Object;)V
        //   919: aload           8
        //   921: astore          7
        //   923: aload           11
        //   925: invokevirtual   p8y.x:()Landroid/os/Parcel;
        //   928: astore          10
        //   930: aload           8
        //   932: astore          7
        //   934: aload           10
        //   936: aload           12
        //   938: invokestatic    gny.b:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   941: aload           8
        //   943: astore          7
        //   945: aload           10
        //   947: aload_1        
        //   948: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   951: aload           8
        //   953: astore          7
        //   955: aload           10
        //   957: iload_2        
        //   958: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   961: aload           8
        //   963: astore          7
        //   965: aload           11
        //   967: iconst_3       
        //   968: aload           10
        //   970: invokevirtual   p8y.s:(ILandroid/os/Parcel;)Landroid/os/Parcel;
        //   973: astore_1       
        //   974: aload           8
        //   976: astore          7
        //   978: aload_1        
        //   979: invokevirtual   android/os/Parcel.readInt:()I
        //   982: istore_2       
        //   983: aload           8
        //   985: astore          7
        //   987: aload_1        
        //   988: invokevirtual   android/os/Parcel.recycle:()V
        //   991: goto            1084
        //   994: astore          8
        //   996: goto            1086
        //   999: astore          8
        //  1001: aload           9
        //  1003: astore_1       
        //  1004: aload_1        
        //  1005: astore          7
        //  1007: aload           8
        //  1009: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1012: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1015: astore          8
        //  1017: aload_1        
        //  1018: astore          7
        //  1020: aload           8
        //  1022: invokevirtual   java/lang/String.length:()I
        //  1025: ifeq            1044
        //  1028: aload_1        
        //  1029: astore          7
        //  1031: ldc_w           "Failed to retrieve remote module version: "
        //  1034: aload           8
        //  1036: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1039: astore          8
        //  1041: goto            1059
        //  1044: aload_1        
        //  1045: astore          7
        //  1047: new             Ljava/lang/String;
        //  1050: dup            
        //  1051: ldc_w           "Failed to retrieve remote module version: "
        //  1054: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //  1057: astore          8
        //  1059: aload_1        
        //  1060: astore          7
        //  1062: ldc             "DynamiteModule"
        //  1064: aload           8
        //  1066: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  1069: pop            
        //  1070: iload_3        
        //  1071: istore_2       
        //  1072: aload_1        
        //  1073: ifnull          1084
        //  1076: aload_1        
        //  1077: invokeinterface android/database/Cursor.close:()V
        //  1082: iload_3        
        //  1083: istore_2       
        //  1084: iload_2        
        //  1085: ireturn        
        //  1086: aload           7
        //  1088: astore_1       
        //  1089: aload           8
        //  1091: astore          7
        //  1093: aload_1        
        //  1094: ifnull          1103
        //  1097: aload_1        
        //  1098: invokeinterface android/database/Cursor.close:()V
        //  1103: aload           7
        //  1105: athrow         
        //  1106: astore_1       
        //  1107: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //  1109: monitorexit    
        //  1110: aload_1        
        //  1111: athrow         
        //  1112: astore_1       
        //  1113: aload_0        
        //  1114: ldc             "null reference"
        //  1116: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //  1119: pop            
        //  1120: goto            1135
        //  1123: astore_0       
        //  1124: ldc_w           "CrashUtils"
        //  1127: ldc_w           "Error adding exception to DropBox!"
        //  1130: aload_0        
        //  1131: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1134: pop            
        //  1135: aload_1        
        //  1136: athrow         
        //  1137: astore          7
        //  1139: goto            96
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                             
        //  -----  -----  -----  -----  -----------------------------------------------------------------
        //  0      3      1112   1137   Any
        //  3      8      1106   1112   Any
        //  26     59     324    326    Ljava/lang/ClassNotFoundException;
        //  26     59     319    324    Ljava/lang/IllegalAccessException;
        //  26     59     314    319    Ljava/lang/NoSuchFieldException;
        //  26     59     1106   1112   Any
        //  59     70     306    314    Any
        //  75     88     306    314    Any
        //  91     96     1137   1142   Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  91     96     306    314    Any
        //  96     101    306    314    Any
        //  104    123    306    314    Any
        //  131    143    267    286    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  131    143    306    314    Any
        //  148    156    267    286    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  148    156    306    314    Any
        //  159    164    267    286    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  159    164    306    314    Any
        //  172    205    267    286    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  172    205    306    314    Any
        //  208    233    267    286    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  208    233    306    314    Any
        //  233    251    267    286    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  233    251    306    314    Any
        //  251    254    306    314    Any
        //  254    257    1106   1112   Any
        //  259    262    306    314    Any
        //  262    265    1106   1112   Any
        //  269    283    306    314    Any
        //  286    300    306    314    Any
        //  300    303    306    314    Any
        //  308    311    306    314    Any
        //  311    314    324    326    Ljava/lang/ClassNotFoundException;
        //  311    314    319    324    Ljava/lang/IllegalAccessException;
        //  311    314    314    319    Ljava/lang/NoSuchFieldException;
        //  311    314    1106   1112   Any
        //  326    386    1106   1112   Any
        //  386    391    1106   1112   Any
        //  391    394    1106   1112   Any
        //  394    401    1112   1137   Any
        //  411    418    420    467    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  411    418    1112   1137   Any
        //  421    444    1112   1137   Any
        //  447    458    1112   1137   Any
        //  458    465    1112   1137   Any
        //  467    473    1112   1137   Any
        //  487    501    999    1004   Landroid/os/RemoteException;
        //  487    501    994    999    Any
        //  505    512    999    1004   Landroid/os/RemoteException;
        //  505    512    994    999    Any
        //  516    521    999    1004   Landroid/os/RemoteException;
        //  516    521    994    999    Any
        //  531    536    999    1004   Landroid/os/RemoteException;
        //  531    536    994    999    Any
        //  540    550    999    1004   Landroid/os/RemoteException;
        //  540    550    994    999    Any
        //  559    566    999    1004   Landroid/os/RemoteException;
        //  559    566    994    999    Any
        //  575    584    999    1004   Landroid/os/RemoteException;
        //  575    584    994    999    Any
        //  591    596    999    1004   Landroid/os/RemoteException;
        //  591    596    994    999    Any
        //  600    606    999    1004   Landroid/os/RemoteException;
        //  600    606    994    999    Any
        //  610    638    999    1004   Landroid/os/RemoteException;
        //  610    638    994    999    Any
        //  642    651    765    774    Landroid/os/RemoteException;
        //  642    651    760    765    Any
        //  654    663    765    774    Landroid/os/RemoteException;
        //  654    663    760    765    Any
        //  668    678    765    774    Landroid/os/RemoteException;
        //  668    678    760    765    Any
        //  689    703    765    774    Landroid/os/RemoteException;
        //  689    703    760    765    Any
        //  722    728    1112   1137   Any
        //  734    743    765    774    Landroid/os/RemoteException;
        //  734    743    760    765    Any
        //  749    755    1112   1137   Any
        //  784    793    999    1004   Landroid/os/RemoteException;
        //  784    793    994    999    Any
        //  797    802    999    1004   Landroid/os/RemoteException;
        //  797    802    994    999    Any
        //  806    812    999    1004   Landroid/os/RemoteException;
        //  806    812    994    999    Any
        //  816    823    999    1004   Landroid/os/RemoteException;
        //  816    823    994    999    Any
        //  827    834    999    1004   Landroid/os/RemoteException;
        //  827    834    994    999    Any
        //  838    844    999    1004   Landroid/os/RemoteException;
        //  838    844    994    999    Any
        //  848    854    999    1004   Landroid/os/RemoteException;
        //  848    854    994    999    Any
        //  858    867    999    1004   Landroid/os/RemoteException;
        //  858    867    994    999    Any
        //  871    876    999    1004   Landroid/os/RemoteException;
        //  871    876    994    999    Any
        //  880    884    999    1004   Landroid/os/RemoteException;
        //  880    884    994    999    Any
        //  891    900    999    1004   Landroid/os/RemoteException;
        //  891    900    994    999    Any
        //  904    909    999    1004   Landroid/os/RemoteException;
        //  904    909    994    999    Any
        //  913    919    999    1004   Landroid/os/RemoteException;
        //  913    919    994    999    Any
        //  923    930    999    1004   Landroid/os/RemoteException;
        //  923    930    994    999    Any
        //  934    941    999    1004   Landroid/os/RemoteException;
        //  934    941    994    999    Any
        //  945    951    999    1004   Landroid/os/RemoteException;
        //  945    951    994    999    Any
        //  955    961    999    1004   Landroid/os/RemoteException;
        //  955    961    994    999    Any
        //  965    974    999    1004   Landroid/os/RemoteException;
        //  965    974    994    999    Any
        //  978    983    999    1004   Landroid/os/RemoteException;
        //  978    983    994    999    Any
        //  987    991    999    1004   Landroid/os/RemoteException;
        //  987    991    994    999    Any
        //  1007   1017   994    999    Any
        //  1020   1028   994    999    Any
        //  1031   1041   994    999    Any
        //  1047   1059   994    999    Any
        //  1062   1070   994    999    Any
        //  1076   1082   1112   1137   Any
        //  1097   1103   1112   1137   Any
        //  1103   1106   1112   1137   Any
        //  1107   1110   1106   1112   Any
        //  1110   1112   1112   1137   Any
        //  1113   1120   1123   1135   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0091:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int e(Context query, final String s, boolean h) throws LoadingException {
        Context context = null;
        Context context2 = null;
        final Context context3 = null;
        final Exception ex4;
        Label_0457: {
            try {
                final long longValue = ((ThreadLocal<Long>)DynamiteModule.k).get();
                final ContentResolver contentResolver = query.getContentResolver();
                String s2 = "api_force_staging";
                boolean b = true;
                if (!h) {
                    s2 = "api";
                }
                query = (Context)contentResolver.query(new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").path(s2).appendPath(s).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), (String[])null, (String)null, (String[])null, (String)null);
                Label_0359: {
                    if (query == null) {
                        break Label_0359;
                    }
                    context = query;
                    context2 = query;
                    try {
                        if (!((Cursor)query).moveToFirst()) {
                            context = query;
                            context2 = query;
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            context = query;
                            context2 = query;
                            context = query;
                            context2 = query;
                            final LoadingException ex = new LoadingException("Failed to connect to dynamite module ContentResolver.");
                            context = query;
                            context2 = query;
                            throw ex;
                        }
                        h = false;
                        context = query;
                        context2 = query;
                        final int int1 = ((Cursor)query).getInt(0);
                        final Context context4 = query;
                        if (int1 > 0) {
                            context = query;
                            context2 = query;
                            monitorenter(DynamiteModule.class);
                            try {
                                DynamiteModule.g = ((Cursor)query).getString(2);
                                final int columnIndex = ((Cursor)query).getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    DynamiteModule.i = ((Cursor)query).getInt(columnIndex);
                                }
                                final int columnIndex2 = ((Cursor)query).getColumnIndex("disableStandaloneDynamiteLoader");
                                if (columnIndex2 >= 0) {
                                    if (((Cursor)query).getInt(columnIndex2) != 0) {
                                        h = true;
                                    }
                                    else {
                                        h = false;
                                    }
                                    DynamiteModule.h = h;
                                }
                                else {
                                    h = false;
                                }
                                monitorexit(DynamiteModule.class);
                                context = query;
                                context2 = query;
                                final vrz vrz = DynamiteModule.j.get();
                                Label_0284: {
                                    if (vrz != null) {
                                        context = query;
                                        context2 = query;
                                        if (vrz.a == null) {
                                            context = query;
                                            context2 = query;
                                            vrz.a = (Cursor)query;
                                            break Label_0284;
                                        }
                                    }
                                    b = false;
                                }
                                if (b) {
                                    query = context3;
                                }
                            }
                            finally {
                                monitorexit(DynamiteModule.class);
                                context = query;
                                context2 = query;
                            }
                        }
                        if (!h) {
                            if (context4 != null) {
                                ((Cursor)context4).close();
                            }
                            return int1;
                        }
                        context = context4;
                        context2 = context4;
                        context = context4;
                        context2 = context4;
                        final LoadingException ex2 = new LoadingException("forcing fallback to container DynamiteLoader impl");
                        context = context4;
                        context2 = context4;
                        throw ex2;
                    }
                    catch (final Exception ex3) {}
                }
            }
            catch (final Exception ex4) {
                query = context;
            }
            finally {
                query = context2;
                break Label_0457;
            }
            try {
                if (ex4 instanceof LoadingException) {
                    throw ex4;
                }
                throw new LoadingException("V2 version check failed", ex4);
            }
            finally {}
        }
        if (query != null) {
            ((Cursor)query).close();
        }
        throw ex4;
    }
    
    public static DynamiteModule f(final Context context, String s) {
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "Selected local version of ".concat(s);
        }
        else {
            s = new String("Selected local version of ");
        }
        Log.i("DynamiteModule", s);
        return new DynamiteModule(context.getApplicationContext());
    }
    
    public static void g(ClassLoader n) throws LoadingException {
        try {
            n = (NoSuchMethodException)((ClassLoader)n).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (n == null) {
                n = null;
            }
            else {
                final IInterface queryLocalInterface = ((IBinder)n).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof oxz) {
                    n = (NoSuchMethodException)queryLocalInterface;
                }
                else {
                    n = (NoSuchMethodException)new oxz((IBinder)n);
                }
            }
            DynamiteModule.n = (oxz)n;
            return;
        }
        catch (final NoSuchMethodException n) {}
        catch (final InvocationTargetException n) {}
        catch (final InstantiationException n) {}
        catch (final IllegalAccessException n) {}
        catch (final ClassNotFoundException ex) {}
        throw new LoadingException("Failed to instantiate dynamite loader", n);
    }
    
    public static nwz h(final Context context) {
        synchronized (DynamiteModule.class) {
            final nwz m = DynamiteModule.m;
            if (m != null) {
                return m;
            }
            try {
                final IBinder binder = (IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                nwz i;
                if (binder == null) {
                    i = null;
                }
                else {
                    final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof nwz) {
                        i = (nwz)queryLocalInterface;
                    }
                    else {
                        i = new nwz(binder);
                    }
                }
                if (i != null) {
                    return DynamiteModule.m = i;
                }
            }
            catch (final Exception ex) {
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to load IDynamiteLoader from GmsCore: ".concat(value);
                }
                else {
                    concat = new String("Failed to load IDynamiteLoader from GmsCore: ");
                }
                Log.e("DynamiteModule", concat);
            }
            return null;
        }
    }
    
    public final IBinder b(String o) throws LoadingException {
        IBinder binder = null;
        try {
            binder = (IBinder)this.a.getClassLoader().loadClass((String)o).newInstance();
            return binder;
        }
        catch (final IllegalAccessException binder) {}
        catch (final InstantiationException binder) {}
        catch (final ClassNotFoundException ex) {}
        o = String.valueOf(o);
        if (((String)o).length() != 0) {
            o = "Failed to instantiate module class: ".concat((String)o);
        }
        else {
            o = new String("Failed to instantiate module class: ");
        }
        throw new LoadingException((String)o, (Throwable)binder);
    }
    
    @DynamiteApi
    public static class DynamiteLoaderClassLoader
    {
        public static ClassLoader sClassLoader;
    }
    
    public static class LoadingException extends Exception
    {
        public LoadingException(final String s) {
            super(s);
        }
        
        public LoadingException(final String s, final Throwable t) {
            super(s, t);
        }
    }
    
    public interface a
    {
        b a(final Context p0, final String p1, final DynamiteModule.a.a p2) throws LoadingException;
        
        public interface a
        {
            int a(final Context p0, final String p1, final boolean p2) throws LoadingException;
            
            int b(final Context p0, final String p1);
        }
        
        public static final class b
        {
            public int a;
            public int b;
            public int c;
            
            public b() {
                this.a = 0;
                this.b = 0;
                this.c = 0;
            }
        }
    }
}
