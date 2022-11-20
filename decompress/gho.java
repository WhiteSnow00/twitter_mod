import android.widget.TextView;
import java.util.Iterator;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gho implements ilx<pho, Object, dho>
{
    public static final gho.gho$a Companion;
    public final View D0;
    public final cho E0;
    public final obi<?> F0;
    public final n4s G0;
    public final n4s H0;
    public final n4s I0;
    public final n4s J0;
    public final n4s K0;
    public final n4s L0;
    public final rhh<pho> M0;
    
    static {
        Companion = new gho.gho$a();
    }
    
    public gho(View d0, final cho e0, final dgo adapter, final obi<?> f0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)e0, "itemProvider");
        czd.f((Object)adapter, "adapter");
        czd.f((Object)f0, "navigator");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (n4s)pps.n((nsb)new nsb<RecyclerView>(this) {
            public final gho D0;
            
            public final Object invoke() {
                return this.D0.D0.findViewById(2131431561);
            }
        });
        this.H0 = (n4s)pps.n((nsb)new nsb<TypefacesTextView>(this) {
            public final gho D0;
            
            public final Object invoke() {
                return this.D0.D0.findViewById(2131431560);
            }
        });
        this.I0 = (n4s)pps.n((nsb)new nsb<LinearLayout>(this) {
            public final gho D0;
            
            public final Object invoke() {
                return this.D0.D0.findViewById(2131431559);
            }
        });
        this.J0 = (n4s)pps.n((nsb)new nsb<ImageView>(this) {
            public final gho D0;
            
            public final Object invoke() {
                return this.D0.D0.findViewById(2131431557);
            }
        });
        final n4s k0 = (n4s)pps.n((nsb)new nsb<View>(this) {
            public final gho D0;
            
            public final Object invoke() {
                return this.D0.D0.findViewById(2131431558);
            }
        });
        this.K0 = k0;
        final n4s l0 = (n4s)pps.n((nsb)new nsb<gho.gho$a.a>(this) {
            public final gho D0;
            
            public final Object invoke() {
                final Context context = this.D0.D0.getContext();
                czd.e((Object)context, "rootView.context");
                return new gho.gho$a.a(context);
            }
        });
        this.L0 = l0;
        this.M0 = (rhh<pho>)q3j.g0((qsb)new qsb<rhh$a<pho>, fzv>(this) {
            public final gho D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)hho.D0 }, (qsb)new iho(this.D0));
                return fzv.a;
            }
        });
        final RecyclerView d2 = this.d();
        d0.getContext();
        final LinearLayoutManager layoutManager = new LinearLayoutManager(1);
        layoutManager.J1(0);
        d2.setLayoutManager((RecyclerView$m)layoutManager);
        this.d().setAdapter((RecyclerView$e)adapter);
        this.d().h((RecyclerView$l)l0.getValue());
        final boolean j = djo.J();
        final LinearLayout b = this.b();
        if (b != null) {
            int visibility;
            if (j) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)b).setVisibility(visibility);
        }
        final TypefacesTextView c = this.c();
        int visibility2;
        if (j ^ true) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)c).setVisibility(visibility2);
        final ImageView a = this.a();
        if (a != null) {
            ((View)a).setVisibility(8);
        }
        final View view = (View)k0.getValue();
        if (view != null) {
            view.setVisibility(8);
        }
        final TypefacesTextView c2 = this.c();
        String text;
        if (j) {
            text = d0.getResources().getString(2131958189);
        }
        else {
            text = d0.getResources().getString(2131958196, new Object[] { 3 });
        }
        ((TextView)c2).setText((CharSequence)text);
        if (j) {
            final Iterator iterator = s9i.s((View)this.a(), (View)this.b()).iterator();
            while (iterator.hasNext()) {
                d0 = (View)iterator.next();
                if (d0 != null) {
                    d0.setOnClickListener((View$OnClickListener)new fho((Object)this, 0));
                }
            }
            ((View)this.d()).setVisibility(8);
        }
        ec0.d(this.D0, 300);
    }
    
    public final void T(final jbx jbx) {
        final pho pho = (pho)jbx;
        czd.f((Object)pho, "state");
        this.M0.b((Object)pho);
    }
    
    public final ImageView a() {
        return (ImageView)this.J0.getValue();
    }
    
    public final LinearLayout b() {
        return (LinearLayout)this.I0.getValue();
    }
    
    public final TypefacesTextView c() {
        final Object value = this.H0.getValue();
        czd.e(value, "<get-descriptionTitle>(...)");
        return (TypefacesTextView)value;
    }
    
    public final RecyclerView d() {
        final Object value = this.G0.getValue();
        czd.e(value, "<get-recyclerView>(...)");
        return (RecyclerView)value;
    }
    
    public final void q(final Object o) {
        final dho dho = (dho)o;
        czd.f((Object)dho, "effect");
        if (dho instanceof dho$b) {
            this.d().v0(0);
        }
        else if (dho instanceof dho$a) {
            this.D0.setVisibility(8);
        }
    }
    
    public final h5j w() {
        return zip.a();
    }
}
