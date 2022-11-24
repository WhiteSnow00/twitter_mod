import java.util.Iterator;
import android.view.View$MeasureSpec;
import java.util.ArrayList;
import android.view.View$OnAttachStateChangeListener;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.material.tabs.c$b;
import com.google.android.material.tabs.c;
import androidx.viewpager2.widget.ViewPager2$e;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f8o extends b4e<e8o, b>
{
    public final mxe<ln6> d;
    public final mxe<on6> e;
    public final nn6 f;
    public final n8o g;
    
    public f8o(final mxe<ln6> d, final mxe<on6> e, final nn6 f, final n8o g) {
        e0e.f((Object)d, "contentSharingAdapterLazy");
        e0e.f((Object)e, "contentSharingProviderLazy");
        e0e.f((Object)f, "contentSharingItemBinder");
        e0e.f((Object)g, "sharingItemSelectionDispatcher");
        super((Class)e8o.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final b b = (b)n8x;
        final e8o e8o = (e8o)o;
        e0e.f((Object)b, "viewHolder");
        e0e.f((Object)e8o, "item");
        if (b.I0.getAdapter() == null) {
            b.I0.setAdapter((RecyclerView$e)this.d.get());
            b.I0.b((ViewPager2$e)new l8o(this));
            b.I0.d(e8o.a, false);
            new c(b.J0, b.I0, (c$b)erf.V0).a();
        }
        if (((View)b.I0).getVisibility() == 8 && e8o.b) {
            kcm.i((sj)new d62(vq9.h((View)b.I0).take(1L).subscribe((rk6)new ltt((stb)new m8o(b, e8o), 5)), 5));
            ((View)b.I0).setVisibility(0);
            ((View)b.J0).setVisibility(0);
        }
        else if (((View)b.I0).getVisibility() == 0 && !e8o.b) {
            ((View)b.I0).setVisibility(8);
            ((View)b.J0).setVisibility(8);
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131625487, viewGroup, false);
        final Object value = this.e.get();
        e0e.e(value, "contentSharingProviderLazy.get()");
        final on6 on6 = (on6)value;
        e0e.e((Object)x, "itemView");
        return (n8x)new b(on6, x, this.f);
    }
    
    public static final class a implements n4e
    {
        public final znl<kni> a;
        
        public a() {
            this.a = (znl<kni>)new znl();
        }
        
        public final void a() {
            this.a.onNext((Object)kni.a);
        }
        
        public final void b(final int n, final int n2) {
        }
        
        public final void c(final int n, final int n2) {
        }
        
        public final void d(final int n, final int n2, final Object o) {
        }
        
        public final void e(final int n, final int n2) {
        }
        
        public final void f(final int n) {
        }
        
        public final void g(final int n) {
        }
    }
    
    public static final class b implements n8x
    {
        public final on6 F0;
        public final View G0;
        public final nn6 H0;
        public final ViewPager2 I0;
        public final TabLayout J0;
        public final e39 K0;
        public final a L0;
        
        public b(final on6 f0, View viewById, final nn6 h0) {
            e0e.f((Object)h0, "contentSharingItemBinder");
            this.F0 = f0;
            this.G0 = viewById;
            this.H0 = h0;
            final View viewById2 = viewById.findViewById(2131431115);
            e0e.e((Object)viewById2, "itemView.findViewById(R.\u2026oom_shared_content_pager)");
            final ViewPager2 i0 = (ViewPager2)viewById2;
            this.I0 = i0;
            viewById = viewById.findViewById(2131431116);
            e0e.e((Object)viewById, "itemView.findViewById(R.\u2026hared_content_tab_layout)");
            this.J0 = (TabLayout)viewById;
            this.K0 = new e39();
            this.L0 = new a();
            i0.setOrientation(0);
            ((View)i0).setNestedScrollingEnabled(true);
            ((View)i0).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new f8o$b$a(this));
        }
        
        public final void a(final ViewPager2 viewPager2, int intValue) {
            if (!((fj8)this.F0).c()) {
                return;
            }
            final nn6.a o = this.H0.o((ViewGroup)viewPager2);
            final p4e f = ((fj8)this.F0).f();
            e0e.e((Object)f, "provider.items");
            final ArrayList list = new ArrayList(nr4.d1((Iterable)f, 10));
            final Iterator iterator = f.iterator();
            int n;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                n = 0;
                if (!hasNext) {
                    break;
                }
                final sxp sxp = (sxp)iterator.next();
                final y06 y06 = new y06();
                final kcm a = kcm.Companion.a((yz5)y06);
                final nn6 h0 = this.H0;
                e0e.e((Object)sxp, "it");
                h0.n(o, sxp, a);
                o.F0.measure(View$MeasureSpec.makeMeasureSpec(intValue, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
                final int measuredHeight = o.F0.getMeasuredHeight();
                y06.onComplete();
                list.add((Object)measuredHeight);
            }
            final Iterator iterator2 = list.iterator();
            Object next;
            if (!iterator2.hasNext()) {
                next = null;
            }
            else {
                next = iterator2.next();
                if (iterator2.hasNext()) {
                    int intValue2 = ((Number)next).intValue();
                    Number n2 = (Number)next;
                    do {
                        final Object next2 = iterator2.next();
                        final int intValue3 = ((Number)next2).intValue();
                        next = n2;
                        if ((intValue = intValue2) < intValue3) {
                            next = next2;
                            intValue = intValue3;
                        }
                        n2 = (Number)next;
                        intValue2 = intValue;
                    } while (iterator2.hasNext());
                }
            }
            final Integer n3 = (Integer)next;
            intValue = n;
            if (n3 != null) {
                intValue = n3;
            }
            ((View)viewPager2).post((Runnable)new axb((Object)viewPager2, intValue, 3));
        }
        
        public final View getHeldView() {
            return this.G0;
        }
    }
}
