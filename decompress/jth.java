import java.util.Map;
import android.os.Looper;
import java.util.HashMap;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jth
{
    public jth(final fve fve, final f49 f49, final ibm ibm) {
        zzd.f((Object)fve, "launchTracker");
        zzd.f((Object)f49, "dmTabBadgeDisplayTracker");
        zzd.f((Object)ibm, "releaseCompletable");
        final rv1 g = fve.g;
        Objects.requireNonNull(g, "observable is null");
        final wz5 wz5 = new wz5((naj)g);
        final m29 m29 = new m29();
        ((raa)ibm).d().q((rj)new h49(m29));
        m29.c(((iz5)wz5).q((rj)new i49(f49)));
    }
    
    public jth(final jn6 jn6, final lcv lcv, final oda oda) {
        zzd.f((Object)lcv, "twitterListViewHost");
        zzd.f((Object)oda, "eventSourceRegistrar");
        if (jn6 != null) {
            final View view = jn6.getView();
            if (view != null) {
                final RecyclerView b = lcv.H0.b;
                zzd.e((Object)b, "twitterListViewHost.listWrapper.view");
                oda.d((View)b, view);
                oda.h((View)b, (ida)new nte("timeline", "timeline"));
            }
        }
    }
    
    public jth(final qll qll, final n4j n4j, final int n) {
        if (n != 14) {
            zzd.f((Object)qll, "frescoProvider");
            n4j.a(qll, true);
            return;
        }
        n4j.a(qll, dta.c().b("android_growth_performance_holdback_perf_optimize_user_scope_initializers", false));
    }
    
    public jth(final x6w x6w, final ibm ibm, final aws aws) {
        zzd.f((Object)x6w, "pageTracker");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)aws, "timelineIdentifier");
        String b;
        if ((b = aws.a.b) == null) {
            b = "";
        }
        final HashMap b2 = x6w.b;
        Object o;
        if ((o = b2.get(b)) == null) {
            o = 0;
            b2.put(b, o);
        }
        b2.put(b, ((Number)o).intValue() + 1);
        ibm.i((rj)new l6p((Object)x6w, (Object)aws, 11));
    }
    
    public static /* synthetic */ void a(final int n) {
        final Object[] array = new Object[3];
        switch (n) {
            default: {
                array[0] = "a";
                break;
            }
            case 9: {
                array[0] = "typeProjection";
                break;
            }
            case 8: {
                array[0] = "type";
                break;
            }
            case 6:
            case 11: {
                array[0] = "supertype";
                break;
            }
            case 5:
            case 10: {
                array[0] = "subtype";
                break;
            }
            case 2:
            case 7: {
                array[0] = "typeCheckingProcedure";
                break;
            }
            case 1:
            case 4: {
                array[0] = "b";
                break;
            }
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (n) {
            default: {
                array[2] = "assertEqualTypes";
                break;
            }
            case 10:
            case 11: {
                array[2] = "noCorrespondingSupertype";
                break;
            }
            case 8:
            case 9: {
                array[2] = "capture";
                break;
            }
            case 5:
            case 6:
            case 7: {
                array[2] = "assertSubtype";
                break;
            }
            case 3:
            case 4: {
                array[2] = "assertEqualTypeConstructors";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public static final boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    public final boolean b(final riv riv, final riv riv2) {
        if (riv == null) {
            a(3);
            throw null;
        }
        if (riv2 != null) {
            return riv.equals(riv2);
        }
        a(4);
        throw null;
    }
    
    public final void c(final Map map, final Map map2, final String s, final w9h w9h) {
        final String z = rp2.Z(map, s);
        if (!zzd.a((Object)z, (Object)"not_found")) {
            rp2.L0(map2, (Object)Float.parseFloat(z), w9h);
        }
    }
    
    public final void d(final Map map, final Map map2, final String s, final w9h w9h) {
        final String y = rp2.Y(map, y4r.C0, s);
        if (!zzd.a((Object)y, (Object)"not_found")) {
            rp2.L0(map2, (Object)Float.parseFloat(y), w9h);
        }
    }
    
    public final void e(final Map map, final Map map2, final String s, final w9h w9h) {
        final String y = rp2.Y(map, y4r.C0, s);
        if (!zzd.a((Object)y, (Object)"not_found")) {
            rp2.L0(map2, (Object)Integer.parseInt(y), w9h);
        }
    }
}
