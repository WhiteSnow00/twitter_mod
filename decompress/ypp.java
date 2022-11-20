import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypp extends hub implements qsb<View, opp>
{
    public ypp(final Object o) {
        super(1, o, (Class)opp$a.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/settings/search/SettingsSearchResultsViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((opp$a)((m93)this).receiver).a(view);
    }
}
