import android.os.BaseBundle;
import java.util.Iterator;
import java.util.WeakHashMap;
import android.content.Context;
import android.view.View$OnAttachStateChangeListener;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2$e;
import com.google.android.material.tabs.c$b;
import com.google.android.material.tabs.c;
import androidx.recyclerview.widget.RecyclerView$e;
import com.google.android.material.tabs.TabLayout;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.appcompat.widget.Toolbar;
import com.twitter.subsystem.reactions.TweetReactionTimelinePagerActivityContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class opu implements xlx<qpu, npu, mpu>
{
    public static final c Companion;
    public final fci<?> F0;
    public final s4e<gpu> G0;
    public final TweetReactionTimelinePagerActivityContentViewArgs H0;
    public final duo I0;
    public final Toolbar J0;
    public final ViewPager2 K0;
    public boolean L0;
    public int M0;
    public final e39 N0;
    
    static {
        Companion = new c();
    }
    
    public opu(final View view, final fci<?> f0, final j4e<gpu> adapter, final s4e<gpu> g0, final TweetReactionTimelinePagerActivityContentViewArgs h0, final duo i0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "navigator");
        e0e.f((Object)adapter, "itemAdapter");
        e0e.f((Object)g0, "itemCollectionProvider");
        e0e.f((Object)h0, "args");
        e0e.f((Object)i0, "savedStateHandler");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final View viewById = view.findViewById(2131432115);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.toolbar)");
        final Toolbar j0 = (Toolbar)viewById;
        this.J0 = j0;
        final View viewById2 = view.findViewById(2131431878);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.tab_layout)");
        final TabLayout tabLayout = (TabLayout)viewById2;
        final View viewById3 = view.findViewById(2131432594);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.view_pager)");
        final ViewPager2 k0 = (ViewPager2)viewById3;
        this.K0 = k0;
        this.L0 = true;
        final e39 n0 = new e39();
        this.N0 = n0;
        k0.setAdapter((RecyclerView$e)adapter);
        tabLayout.setInlineLabel(true);
        tabLayout.setTabTextColors(zrm.Companion.b(view).i(2131100863));
        new com.google.android.material.tabs.c(tabLayout, k0, (c$b)new nea(adapter, view, 8)).a();
        k0.b((ViewPager2$e)new opu$a((j4e)adapter, this));
        final Context context = view.getContext();
        e0e.e((Object)context, "rootView.context");
        final String string = context.getString(2131951731);
        e0e.e((Object)string, "context.getString(R.stri\u2026on_timeline_toolbar_back)");
        j0.setNavigationContentDescription((CharSequence)string);
        n0.c(i0.a((gto<?>)new tt2(this) {
            public final opu F0;
            
            public final void a(final Bundle bundle) {
                ((BaseBundle)bundle).putInt("reactions_page_key", this.F0.K0.getCurrentItem());
                bundle.putBoolean("reactions_initial_page_key", this.F0.L0);
            }
            
            public final void v(final Parcelable parcelable) {
                final Bundle bundle = (Bundle)parcelable;
                this.F0.M0 = ((BaseBundle)bundle).getInt("reactions_page_key");
                this.F0.L0 = bundle.getBoolean("reactions_initial_page_key");
            }
        }));
        final WeakHashMap a = b7x.a;
        if (!b7x$g.b((View)k0)) {
            n0.a();
        }
        else {
            ((View)k0).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener(k0, this) {
                public final View F0;
                public final opu G0;
                
                public final void onViewAttachedToWindow(final View view) {
                    e0e.f((Object)view, "view");
                }
                
                public final void onViewDetachedFromWindow(final View view) {
                    e0e.f((Object)view, "view");
                    this.F0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                    this.G0.N0.a();
                }
            });
        }
    }
    
    public final void T(final ccx ccx) {
        final qpu qpu = (qpu)ccx;
        e0e.f((Object)qpu, "state");
        this.G0.d((p4e)new zkf((Iterable)qpu.a));
        if (this.L0 && (qpu.a.isEmpty() ^ true)) {
            final upu n = bs4.N(this.H0.getReactionType());
            Label_0185: {
                if (n != null) {
                    final Iterator iterator = qpu.a.iterator();
                    int n2 = 0;
                    while (true) {
                        while (iterator.hasNext()) {
                            if (((gpu)iterator.next()).a == n) {
                                int currentItem = n2;
                                if (n2 < 0) {
                                    currentItem = 0;
                                }
                                final ViewPager2 k0 = this.K0;
                                final WeakHashMap a = b7x.a;
                                if (b7x$g.b((View)k0)) {
                                    this.K0.setCurrentItem(currentItem);
                                    break Label_0185;
                                }
                                ((View)k0).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ppu((View)k0, this, currentItem));
                                break Label_0185;
                            }
                            else {
                                ++n2;
                            }
                        }
                        n2 = -1;
                        continue;
                    }
                }
            }
            this.L0 = false;
        }
        else if (this.M0 != this.K0.getCurrentItem()) {
            this.K0.setCurrentItem(this.M0);
        }
    }
    
    public final void r(final Object o) {
        final mpu mpu = (mpu)o;
        e0e.f((Object)mpu, "effect");
        if (mpu instanceof mpu$a) {
            this.F0.k();
        }
    }
    
    public final t5j<npu> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)d4j.o0(this.J0).map((rtb)new uti((stb)opu$f.F0, 7)) });
        e0e.e((Object)mergeArray, "mergeArray(\n        tool\u2026ent.OnBackPressed }\n    )");
        return (t5j<npu>)mergeArray;
    }
    
    public static final class c
    {
    }
    
    public interface d
    {
        opu a(final View p0);
    }
}
