import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
public final class i70 extends p0s implements ftb<cy6, go6<? super Choreographer>, Object>
{
    public i70(final go6<? super i70> go6) {
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new i70((go6<? super i70>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final cy6 cy6 = (cy6)o;
        return new i70((go6<? super i70>)o2).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        return Choreographer.getInstance();
    }
}
