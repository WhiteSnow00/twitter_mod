// 
// Decompiled by Procyon v0.6.0
// 

public final class s31 extends ste implements ftb<vqn, c22, lvj<? extends vqn, ? extends c22>>
{
    public static final s31 D0;
    
    static {
        D0 = new s31();
    }
    
    public s31() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final vqn vqn = (vqn)o;
        final c22 c22 = (c22)o2;
        czd.f((Object)vqn, "state");
        czd.f((Object)c22, "blockedUser");
        return new lvj((Object)vqn, (Object)c22);
    }
}
