import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vqo implements c7x
{
    public final View C0;
    public final View D0;
    
    public vqo(View viewById) {
        this.C0 = viewById;
        viewById = viewById.findViewById(2131431170);
        zzd.e((Object)viewById, "containerView.findViewBy\u2026r_root_constraint_layout)");
        this.D0 = viewById;
    }
    
    public final View getHeldView() {
        return this.D0;
    }
}
