import j$.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.view.View;
import java.util.List;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ba8 implements mhj
{
    public final Resources a;
    public vpa<List<v98>, Integer, mhj, z98> b;
    public View c;
    public ImageView d;
    public RecyclerView e;
    public final ArrayList<v98> f;
    public nhj g;
    
    public ba8(final Resources a, final vpa<List<v98>, Integer, mhj, z98> b) {
        czd.f((Object)a, "resources");
        czd.f((Object)b, "recyclerViewAdapterFactory");
        this.a = a;
        this.b = b;
        this.f = new ArrayList<v98>();
    }
    
    public final void a(final v98 v98) {
        final nhj g = this.g;
        if (g != null) {
            final int d = v98.d;
            final aa8.a companion = aa8.Companion;
            final int ordinal = companion.a(v98.d).ordinal();
            String s;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                final String b = companion.b();
                                final String string = LocalDate.parse((CharSequence)companion.b(), aa8.E0).minusYears(1L).toString();
                                czd.e((Object)string, "parse(getCurrentTime(), \u2026.minusYears(1).toString()");
                                s = mw.y("until:", b, " since:", string);
                            }
                            else {
                                final String b2 = companion.b();
                                final String string2 = LocalDate.parse((CharSequence)companion.b(), aa8.E0).minusMonths(1L).toString();
                                czd.e((Object)string2, "parse(getCurrentTime(), \u2026minusMonths(1).toString()");
                                s = mw.y("until:", b2, " since:", string2);
                            }
                        }
                        else {
                            s = "within_time:7d";
                        }
                    }
                    else {
                        s = "within_time:24h";
                    }
                }
                else {
                    s = "within_time:1h";
                }
            }
            else {
                s = "";
            }
            g.a(new kvj((Object)d, (Object)s));
        }
        final ImageView d2 = this.d;
        if (d2 != null) {
            ((View)d2).performClick();
            return;
        }
        czd.m("backButton");
        throw null;
    }
}
