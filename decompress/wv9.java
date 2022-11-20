import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wv9 extends hub implements qsb<View, tv9>
{
    public wv9(final Object o) {
        super(1, o, (Class)tv9$c.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/profiles/edit/EditVerifiedPhoneStatusViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((tv9$c)((m93)this).receiver).a(view);
    }
}
