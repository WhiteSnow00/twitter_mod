import java.util.List;
import java.io.IOException;
import com.twitter.model.json.common.InvalidJsonFormatException;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;
import com.facebook.imagepipeline.nativecode.NativeCodeInitializer;
import android.content.Context;
import java.util.Iterator;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vqb implements u8e, aky, pyy
{
    public static gfk C0;
    public static volatile boolean D0;
    public static final ep8 E0;
    public static final int[] F0;
    public static final int[] G0;
    
    public static int c(final z19 z19) {
        if (z19 == z19.d) {
            return 2;
        }
        return 3;
    }
    
    public static cse d(int n) {
        if (n == 0) {
            throw null;
        }
        if (--n == 0) {
            return cse.D0;
        }
        switch (n) {
            default: {
                return new cse(1000.0);
            }
            case 16: {
                return new cse(10000.0);
            }
            case 15: {
                return new cse(1000.0);
            }
            case 14: {
                return new cse(10000.0);
            }
            case 13: {
                return new cse(5000.0);
            }
            case 12: {
                return new cse(25.0);
            }
            case 11: {
                return new cse(700.0);
            }
            case 10: {
                return new cse(1000.0);
            }
            case 9: {
                return new cse(2000.0);
            }
            case 8: {
                return new cse(50.0);
            }
            case 7: {
                return new cse(600.0);
            }
            case 6: {
                return new cse(400.0);
            }
            case 5: {
                return new cse(14.0);
            }
            case 4: {
                return new cse(400.0);
            }
            case 3: {
                return new cse(50.0);
            }
            case 2: {
                return new cse(100.0);
            }
        }
    }
    
    public static cse f(int n) {
        if (n == 0) {
            throw null;
        }
        if (--n != 0) {
            if (n != 18) {
                switch (n) {
                    default: {
                        return new cse(500.0);
                    }
                    case 15: {
                        return new cse(1000.0);
                    }
                    case 13: {
                        return new cse(600.0);
                    }
                    case 12: {
                        return new cse(15.0);
                    }
                    case 11: {
                        return new cse(500.0);
                    }
                    case 10: {
                        return new cse(500.0);
                    }
                    case 9: {
                        return new cse(300.0);
                    }
                    case 8: {
                        return new cse(50.0);
                    }
                    case 7: {
                        return new cse(500.0);
                    }
                    case 6: {
                        return new cse(50.0);
                    }
                    case 5: {
                        return new cse(14.0);
                    }
                    case 4: {
                        return new cse(128.0);
                    }
                    case 3: {
                        return new cse(50.0);
                    }
                    case 2: {
                        return new cse(25.0);
                    }
                    case 14:
                    case 16: {
                        break;
                    }
                }
            }
            return new cse(10000.0);
        }
        return cse.D0;
    }
    
    public static j8d g() {
        final n8d t = n8d.t;
        ri4.s((Object)t, (Object)"ImagePipelineFactory was not initialized!");
        if (t.k == null) {
            t.k = t.a();
        }
        return t.k;
    }
    
    public static final gvj h(final Set set, final Map map) {
        zzd.f((Object)map, "inviteTotals");
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final Object next : set) {
            final Integer n = map.get(((CohostInvite)next).getTwitterId());
            boolean b = false;
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            final oio a = oio.a;
            if (intValue < dta.b().f("android_audio_room_max_cohost_invites", 5)) {
                b = true;
            }
            if (b) {
                list.add(next);
            }
            else {
                list2.add(next);
            }
        }
        return new gvj((Object)list, (Object)list2);
    }
    
    public static void i(Context applicationContext, final k8d k8d, final he9 he9) {
        srb.b();
        if (vqb.D0) {
            dli.c0((Class)vqb.class, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        }
        else {
            vqb.D0 = true;
        }
        rqu.D0 = true;
        synchronized (r9i.class) {
            final boolean b = r9i.a != null;
            monitorexit(r9i.class);
            Label_0167: {
                if (!b) {
                    srb.b();
                    try {
                        try {
                            NativeCodeInitializer.class.getMethod("init", Context.class).invoke(null, applicationContext);
                        }
                        finally {}
                    }
                    catch (final NoSuchMethodException ex) {
                        r9i.o((s9i)new m0n());
                    }
                    catch (final InvocationTargetException ex2) {
                        r9i.o((s9i)new m0n());
                    }
                    catch (final IllegalAccessException ex3) {
                        r9i.o((s9i)new m0n());
                    }
                    catch (final ClassNotFoundException ex4) {
                        r9i.o((s9i)new m0n());
                    }
                    srb.b();
                    break Label_0167;
                    srb.b();
                }
            }
            applicationContext = applicationContext.getApplicationContext();
            Label_0223: {
                if (k8d == null) {
                    synchronized (n8d.class) {
                        srb.b();
                        n8d.l((l8d)new k8d(new k8d$b(applicationContext)));
                        srb.b();
                        break Label_0223;
                    }
                }
                n8d.l((l8d)k8d);
            }
            srb.b();
            SimpleDraweeView.J0 = (lyr<? extends ub>)(vqb.C0 = new gfk(applicationContext, he9));
            srb.b();
            srb.b();
        }
    }
    
    public static Object j(final khe khe, final lje lje) throws IOException {
        switch (((Enum)lje).ordinal()) {
            default: {
                e9a.d((Throwable)new InvalidJsonFormatException("Invalid FeatureSwitch value for parsing."));
                khe.m0();
                return null;
            }
            case 10:
            case 11: {
                return khe.b();
            }
            case 9: {
                return khe.f();
            }
            case 8: {
                return khe.i();
            }
            case 7: {
                return khe.j();
            }
            case 12: {
                return null;
            }
        }
    }
    
    public Object a() {
        final azy c = fzy.c;
        return ktz.D0.b().c();
    }
    
    public void b(final ub4 ub4) {
    }
    
    public Object[] e(final Object o, final List list, final List list2) {
        return (Object[])k3j.D(o, "makePathElements", (Class)Object[].class, (Class)List.class, (Object)list);
    }
}
