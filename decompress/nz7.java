import com.twitter.media.ui.image.c;
import android.view.View;
import android.view.LayoutInflater;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.ViewGroup;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nz7 extends v3e<wx7$d, a>
{
    public final UserIdentifier d;
    public final rtb<wx7$d, oyv> e;
    
    public nz7(final Resources resources, final UserIdentifier d, final rtb<? super wx7$d, oyv> e) {
        zzd.f((Object)resources, "res");
        zzd.f((Object)d, "currentUser");
        zzd.f((Object)e, "conversationClickAction");
        super((Class)wx7$d.class);
        this.d = d;
        this.e = (rtb<wx7$d, oyv>)e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final wx7$d wx7$d = (wx7$d)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)wx7$d, "item");
        if (wx7$d instanceof wx7$d$b$b) {
            a.l0((wx7$d$b$b)wx7$d, this.d, this.e);
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        return (c7x)new a(viewGroup);
    }
    
    public static final class a extends rz7<wx7$d$b$b>
    {
        public final FrescoMediaImageView I0;
        
        public a(final ViewGroup viewGroup) {
            zzd.f((Object)viewGroup, "parent");
            final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624351, viewGroup, false);
            zzd.e((Object)inflate, "from(parent.context).inf\u2026ult_media, parent, false)");
            super(inflate);
            final View viewById = inflate.findViewById(2131432486);
            zzd.e((Object)viewById, "heldView.findViewById(R.id.user_media)");
            this.I0 = (FrescoMediaImageView)viewById;
        }
        
        @Override
        public final void m0(final wx7$d wx7$d, final UserIdentifier b) {
            final wx7$d$b$b wx7$d$b$b = (wx7$d$b$b)wx7$d;
            zzd.f((Object)wx7$d$b$b, "item");
            zzd.f((Object)b, "currentUser");
            super.m0(wx7$d$b$b, b);
            dtg d0 = wx7$d$b$b.i.D0;
            final String q0 = d0.Q0;
            zzd.e((Object)q0, "it.mediaUrl");
            if (!(ckr.h1((CharSequence)q0) ^ true)) {
                d0 = null;
            }
            if (d0 != null) {
                final v8d a = v8d.a();
                zzd.e((Object)a, "create()");
                final t8d$a b2 = a.b(d0.Q0, d0.T0);
                ((vqm$a)b2).b = b;
                final int a2 = w4j.a;
                ((vqm$a)b2).c = true;
                ((c)this.I0).q(b2, true);
            }
            else {
                bl0.B("MediaEntity does not contain media url");
            }
        }
    }
}
