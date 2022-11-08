import com.twitter.media.ui.image.c;
import androidx.recyclerview.widget.m$b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.content.Intent;
import java.util.Objects;
import java.util.ArrayList;
import com.twitter.app.bookmarks.folders.BookmarkFolderActivity;
import android.content.Context;
import java.util.List;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhb extends RecyclerView$e<b>
{
    public static final a Companion;
    public final gob F0;
    public final zml<hhb> G0;
    public final LayoutInflater H0;
    public final boolean I0;
    public List<b52> J0;
    public boolean K0;
    public final o62 L0;
    
    static {
        Companion = new a();
    }
    
    public fhb(final gob f0, final zml<hhb> g0) {
        zzd.f((Object)g0, "intentSubject");
        this.F0 = f0;
        this.G0 = g0;
        final LayoutInflater from = LayoutInflater.from((Context)f0);
        zzd.e((Object)from, "from(activity)");
        this.H0 = from;
        this.I0 = (f0 instanceof BookmarkFolderActivity);
        this.J0 = new ArrayList();
        final o62$a companion = o62.Companion;
        final Intent intent = ((Activity)f0).getIntent();
        zzd.e((Object)intent, "activity.intent");
        Objects.requireNonNull(companion);
        this.L0 = new o62(intent);
    }
    
    public final int c() {
        return this.J0.size();
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, int drawableRes) {
        final b b = (b)recyclerView$c0;
        final b52 b2 = this.J0.get(drawableRes);
        b.X0.setText((CharSequence)b2.b);
        if (!(zzd.a(this.J0.get(0), (Object)rhb.Companion.a((Activity)this.F0)) ^ true)) {
            final ImageView y0 = b.Y0;
            final gob f0 = this.F0;
            drawableRes = gpc.z.getDrawableRes();
            final Object a = eo6.a;
            Drawable b3 = eo6$c.b((Context)f0, drawableRes);
            if (b3 != null) {
                b3.setTint(eo6.b((Context)this.F0, 2131099924));
            }
            else {
                b3 = null;
            }
            ((View)y0).setBackground(b3);
        }
        else {
            Drawable background;
            if (b2.c) {
                final gob f2 = this.F0;
                final Object a2 = eo6.a;
                background = eo6$c.b((Context)f2, 2131231941);
            }
            else {
                final gob f3 = this.F0;
                final Object a3 = eo6.a;
                background = eo6$c.b((Context)f3, 2131233431);
            }
            ((View)b.Y0).setBackground(background);
        }
        final ci1 d = b2.d;
        String a4;
        if (d == null) {
            a4 = "https://pbs.twimg.com/media/Ex_eA8cVIAExX7T.png?name=240x240";
        }
        else {
            a4 = d.a;
            zzd.e((Object)a4, "{\n            folderItem.media!!.url\n        }");
        }
        ((com.twitter.media.ui.image.c)b.W0).p(new t8d$a(a4, (kvg)null));
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        zzd.f((Object)viewGroup, "parent");
        final View inflate = this.H0.inflate(2131624111, viewGroup, false);
        zzd.e((Object)inflate, "itemView");
        return new b(inflate);
    }
    
    public static final class a
    {
    }
    
    public final class b extends RecyclerView$c0
    {
        public final FrescoMediaImageView W0;
        public final TextView X0;
        public final ImageView Y0;
        
        public b(final fhb fhb, final View view) {
            super(view);
            final View viewById = view.findViewById(2131429204);
            zzd.e((Object)viewById, "itemView.findViewById(R.id.folder_image)");
            this.W0 = (FrescoMediaImageView)viewById;
            final View viewById2 = view.findViewById(2131432073);
            zzd.e((Object)viewById2, "itemView.findViewById(R.id.title)");
            this.X0 = (TextView)viewById2;
            final View viewById3 = view.findViewById(2131427465);
            zzd.e((Object)viewById3, "itemView.findViewById(R.id.action_image)");
            this.Y0 = (ImageView)viewById3;
            view.setOnClickListener((View$OnClickListener)new gpa(this, fhb, 3));
        }
    }
    
    public static final class c extends m$b
    {
        public final List<b52> a;
        public final List<b52> b;
        
        public c(final List<b52> a, final List<b52> b) {
            zzd.f((Object)a, "oldList");
            this.a = a;
            this.b = b;
        }
        
        public final boolean a(final int n, final int n2) {
            return zzd.a((Object)this.a.get(n), (Object)this.b.get(n2));
        }
        
        public final boolean b(final int n, final int n2) {
            return zzd.a((Object)this.a.get(n).a, (Object)this.b.get(n2).a);
        }
        
        public final int d() {
            return this.b.size();
        }
        
        public final int e() {
            return this.a.size();
        }
    }
}
