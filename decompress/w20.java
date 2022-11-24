import android.view.PointerIcon;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w20
{
    public static final w20 a;
    
    static {
        a = new w20();
    }
    
    public final void a(final View view, final ppk ppk) {
        e0e.f((Object)view, "view");
        PointerIcon pointerIcon;
        if (ppk instanceof k50) {
            Objects.requireNonNull(ppk);
            pointerIcon = null;
        }
        else if (ppk instanceof l50) {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), ((l50)ppk).a);
            e0e.e((Object)pointerIcon, "getSystemIcon(view.context, icon.type)");
        }
        else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            e0e.e((Object)pointerIcon, "getSystemIcon(\n         \u2026DEFAULT\n                )");
        }
        if (!e0e.a((Object)view.getPointerIcon(), (Object)pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
