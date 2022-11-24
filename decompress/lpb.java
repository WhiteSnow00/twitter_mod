import androidx.viewpager2.adapter.FragmentStateAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpb implements Runnable
{
    public final FragmentStateAdapter F0;
    
    public lpb(final FragmentStateAdapter f0) {
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final FragmentStateAdapter f0 = this.F0;
        f0.O0 = false;
        f0.F();
    }
}
