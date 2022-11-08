// 
// Decompiled by Procyon v0.6.0
// 

public final class u94 implements d94
{
    public final t94 a;
    
    public u94(final t94 a) {
        zzd.f((Object)a, "choiceValue");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof u94 && zzd.a((Object)this.a, (Object)((u94)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final t94 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ChoiceValueDisplayItem(choiceValue=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
