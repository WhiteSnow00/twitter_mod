import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Future;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.Method;
import android.util.Log;
import android.os.Build$VERSION;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class smv
{
    public static final anv a;
    public static final cfg<String, Typeface> b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        Label_0121: {
            if (sdk_INT >= 29) {
                a = new zmv();
            }
            else if (sdk_INT >= 28) {
                a = (anv)new ymv();
            }
            else if (sdk_INT >= 26) {
                a = (anv)new xmv();
            }
            else {
                if (sdk_INT >= 24) {
                    final Method d = umv.d;
                    if (d == null) {
                        Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                    }
                    if (d != null) {
                        a = new umv();
                        break Label_0121;
                    }
                }
                a = new tmv();
            }
        }
        b = new cfg<String, Typeface>(16);
    }
    
    public static Typeface a(final Context context, jlb.b b, final Resources resources, final int n, final String s, final int n2, final int n3, dsm$e dsm$e, final boolean b2) {
        Typeface typeface3 = null;
        Label_0634: {
            if (b instanceof jlb$e) {
                final jlb$e jlb$e = (jlb$e)b;
                final String d = jlb$e.d;
                final Typeface typeface = null;
                boolean b3 = false;
                Typeface create = null;
                Label_0072: {
                    if (d != null) {
                        if (!d.isEmpty()) {
                            create = Typeface.create(d, 0);
                            final Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                            if (create != null && !create.equals((Object)create2)) {
                                break Label_0072;
                            }
                        }
                    }
                    create = null;
                }
                if (create != null) {
                    if (dsm$e != null) {
                        dsm$e.b(create);
                    }
                    return create;
                }
                Label_0113: {
                    if (b2) {
                        if (jlb$e.c != 0) {
                            break Label_0113;
                        }
                    }
                    else if (dsm$e != null) {
                        break Label_0113;
                    }
                    b3 = true;
                }
                int b4;
                if (b2) {
                    b4 = jlb$e.b;
                }
                else {
                    b4 = -1;
                }
                final Handler c = dsm$e.c();
                final smv.smv$a smv$a = new smv.smv$a(dsm$e);
                final clb a = jlb$e.a;
                dsm$e = (dsm$e)new ma3((r1n)smv$a, c);
                if (b3) {
                    final String a2 = ilb.a(a, n3);
                    final Typeface typeface2 = ilb.a.c(a2);
                    if (typeface2 != null) {
                        c.post((Runnable)new ka3((r1n)smv$a, typeface2));
                        typeface3 = typeface2;
                        break Label_0634;
                    }
                    if (b4 == -1) {
                        final ilb$a b5 = ilb.b(a2, context, a, n3);
                        ((ma3)dsm$e).a(b5);
                        typeface3 = b5.a;
                        break Label_0634;
                    }
                    final elb elb = new elb(a2, context, a, n3);
                    try {
                        final Future<ilb$a> submit = ilb.b.submit((Callable<ilb$a>)elb);
                        final long n4 = b4;
                        try {
                            final ilb$a ilb$a = submit.get(n4, TimeUnit.MILLISECONDS);
                            ((ma3)dsm$e).a(ilb$a);
                            typeface3 = ilb$a.a;
                            break Label_0634;
                        }
                        catch (final TimeoutException ex) {
                            throw new InterruptedException("timeout");
                        }
                        catch (final InterruptedException ex2) {
                            throw ex2;
                        }
                        catch (final ExecutionException ex4) {
                            try {
                                throw new RuntimeException(ex4);
                            }
                            catch (final InterruptedException ex5) {
                                ((ma3)dsm$e).b.post((Runnable)new la3(((ma3)dsm$e).a, -3));
                                typeface3 = typeface;
                            }
                        }
                        try {
                            final InterruptedException ex2;
                            throw ex2;
                        }
                        catch (final InterruptedException ex6) {}
                    }
                    catch (final InterruptedException ex7) {}
                }
                final String a3 = ilb.a(a, n3);
                final Typeface typeface4 = ilb.a.c(a3);
                if (typeface4 != null) {
                    c.post((Runnable)new ka3((r1n)smv$a, typeface4));
                    typeface3 = typeface4;
                    break Label_0634;
                }
                final flb flb = new flb((ma3)dsm$e);
                b = (jlb.b)ilb.c;
                synchronized (b) {
                    final z8q d2 = ilb.d;
                    final ArrayList list = (ArrayList)d2.getOrDefault((Object)a3, (Object)null);
                    if (list != null) {
                        list.add(flb);
                        monitorexit(b);
                        break Label_0634;
                    }
                    final ArrayList<flb> list2 = new ArrayList<flb>();
                    list2.add(flb);
                    d2.put((Object)a3, (Object)list2);
                    monitorexit(b);
                    final glb glb = new glb(a3, context, a, n3);
                    b = (jlb.b)ilb.b;
                    final hlb hlb = new hlb(a3);
                    Handler handler;
                    if (Looper.myLooper() == null) {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    else {
                        handler = new Handler();
                    }
                    ((ThreadPoolExecutor)b).execute((Runnable)new aom(handler, (Callable)glb, (tk6)hlb));
                    break Label_0634;
                }
            }
            final Typeface typeface5 = typeface3 = smv.a.a(context, (jlb$c)b, resources, n3);
            if (dsm$e != null) {
                if (typeface5 != null) {
                    dsm$e.b(typeface5);
                    typeface3 = typeface5;
                }
                else {
                    dsm$e.a(-3);
                    typeface3 = typeface5;
                }
            }
        }
        if (typeface3 != null) {
            smv.b.d(c(resources, n, s, n2, n3), typeface3);
        }
        return typeface3;
    }
    
    public static Typeface b(final Context context, final Resources resources, final int n, final String s, final int n2, final int n3) {
        final Typeface d = smv.a.d(context, resources, n, s, n3);
        if (d != null) {
            smv.b.d(c(resources, n, s, n2, n3), d);
        }
        return d;
    }
    
    public static String c(final Resources resources, final int n, final String s, final int n2, final int n3) {
        final StringBuilder sb = new StringBuilder(resources.getResourcePackageName(n));
        sb.append('-');
        sb.append(s);
        sb.append('-');
        sb.append(n2);
        sb.append('-');
        sb.append(n);
        sb.append('-');
        sb.append(n3);
        return sb.toString();
    }
}
