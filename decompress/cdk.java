import java.io.ObjectOutput;
import java.io.IOException;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdk implements Externalizable
{
    public boolean F0;
    public String G0;
    public List<Integer> H0;
    public List<Integer> I0;
    public boolean J0;
    public String K0;
    
    public cdk() {
        this.G0 = "";
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.K0 = "";
    }
    
    public final int a() {
        return this.H0.size();
    }
    
    @Override
    public final void readExternal(final ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            final String utf = objectInput.readUTF();
            this.F0 = true;
            this.G0 = utf;
        }
        final int int1 = objectInput.readInt();
        final int n = 0;
        for (int i = 0; i < int1; ++i) {
            this.H0.add(objectInput.readInt());
        }
        for (int int2 = objectInput.readInt(), j = n; j < int2; ++j) {
            this.I0.add(objectInput.readInt());
        }
        if (objectInput.readBoolean()) {
            final String utf2 = objectInput.readUTF();
            this.J0 = true;
            this.K0 = utf2;
        }
    }
    
    @Override
    public final void writeExternal(final ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.F0);
        if (this.F0) {
            objectOutput.writeUTF(this.G0);
        }
        final int a = this.a();
        objectOutput.writeInt(a);
        final int n = 0;
        for (int i = 0; i < a; ++i) {
            objectOutput.writeInt((int)this.H0.get(i));
        }
        final int size = this.I0.size();
        objectOutput.writeInt(size);
        for (int j = n; j < size; ++j) {
            objectOutput.writeInt((int)this.I0.get(j));
        }
        objectOutput.writeBoolean(this.J0);
        if (this.J0) {
            objectOutput.writeUTF(this.K0);
        }
    }
}
