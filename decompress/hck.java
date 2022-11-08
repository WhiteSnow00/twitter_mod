import java.io.ObjectOutput;
import java.io.IOException;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

// 
// Decompiled by Procyon v0.6.0
// 

public class hck implements Externalizable
{
    public boolean A1;
    public boolean B1;
    public boolean C0;
    public String C1;
    public ick D0;
    public boolean D1;
    public boolean E0;
    public boolean E1;
    public ick F0;
    public boolean G0;
    public ick H0;
    public boolean I0;
    public ick J0;
    public boolean K0;
    public ick L0;
    public boolean M0;
    public ick N0;
    public boolean O0;
    public ick P0;
    public boolean Q0;
    public ick R0;
    public boolean S0;
    public ick T0;
    public boolean U0;
    public ick V0;
    public boolean W0;
    public ick X0;
    public boolean Y0;
    public ick Z0;
    public boolean a1;
    public ick b1;
    public boolean c1;
    public ick d1;
    public boolean e1;
    public ick f1;
    public boolean g1;
    public ick h1;
    public boolean i1;
    public ick j1;
    public String k1;
    public int l1;
    public String m1;
    public boolean n1;
    public String o1;
    public boolean p1;
    public String q1;
    public boolean r1;
    public String s1;
    public boolean t1;
    public String u1;
    public boolean v1;
    public String w1;
    public boolean x1;
    public List<gck> y1;
    public List<gck> z1;
    
    public hck() {
        this.D0 = null;
        this.F0 = null;
        this.H0 = null;
        this.J0 = null;
        this.L0 = null;
        this.N0 = null;
        this.P0 = null;
        this.R0 = null;
        this.T0 = null;
        this.V0 = null;
        this.X0 = null;
        this.Z0 = null;
        this.b1 = null;
        this.d1 = null;
        this.f1 = null;
        this.h1 = null;
        this.j1 = null;
        this.k1 = "";
        this.l1 = 0;
        this.m1 = "";
        this.o1 = "";
        this.q1 = "";
        this.s1 = "";
        this.u1 = "";
        this.w1 = "";
        this.x1 = false;
        this.y1 = new ArrayList();
        this.z1 = new ArrayList();
        this.A1 = false;
        this.C1 = "";
        this.D1 = false;
        this.E1 = false;
    }
    
    public hck a(final String k1) {
        this.k1 = k1;
        return this;
    }
    
    public hck b(final String m1) {
        this.m1 = m1;
        return this;
    }
    
    @Override
    public final void readExternal(final ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            final ick d0 = new ick();
            d0.readExternal(objectInput);
            this.C0 = true;
            this.D0 = d0;
        }
        if (objectInput.readBoolean()) {
            final ick f0 = new ick();
            f0.readExternal(objectInput);
            this.E0 = true;
            this.F0 = f0;
        }
        if (objectInput.readBoolean()) {
            final ick h0 = new ick();
            h0.readExternal(objectInput);
            this.G0 = true;
            this.H0 = h0;
        }
        if (objectInput.readBoolean()) {
            final ick j0 = new ick();
            j0.readExternal(objectInput);
            this.I0 = true;
            this.J0 = j0;
        }
        if (objectInput.readBoolean()) {
            final ick l0 = new ick();
            l0.readExternal(objectInput);
            this.K0 = true;
            this.L0 = l0;
        }
        if (objectInput.readBoolean()) {
            final ick n0 = new ick();
            n0.readExternal(objectInput);
            this.M0 = true;
            this.N0 = n0;
        }
        if (objectInput.readBoolean()) {
            final ick p = new ick();
            p.readExternal(objectInput);
            this.O0 = true;
            this.P0 = p;
        }
        if (objectInput.readBoolean()) {
            final ick r0 = new ick();
            r0.readExternal(objectInput);
            this.Q0 = true;
            this.R0 = r0;
        }
        if (objectInput.readBoolean()) {
            final ick t0 = new ick();
            t0.readExternal(objectInput);
            this.S0 = true;
            this.T0 = t0;
        }
        if (objectInput.readBoolean()) {
            final ick v0 = new ick();
            v0.readExternal(objectInput);
            this.U0 = true;
            this.V0 = v0;
        }
        if (objectInput.readBoolean()) {
            final ick x0 = new ick();
            x0.readExternal(objectInput);
            this.W0 = true;
            this.X0 = x0;
        }
        if (objectInput.readBoolean()) {
            final ick z0 = new ick();
            z0.readExternal(objectInput);
            this.Y0 = true;
            this.Z0 = z0;
        }
        if (objectInput.readBoolean()) {
            final ick b1 = new ick();
            b1.readExternal(objectInput);
            this.a1 = true;
            this.b1 = b1;
        }
        if (objectInput.readBoolean()) {
            final ick d2 = new ick();
            d2.readExternal(objectInput);
            this.c1 = true;
            this.d1 = d2;
        }
        if (objectInput.readBoolean()) {
            final ick f2 = new ick();
            f2.readExternal(objectInput);
            this.e1 = true;
            this.f1 = f2;
        }
        if (objectInput.readBoolean()) {
            final ick h2 = new ick();
            h2.readExternal(objectInput);
            this.g1 = true;
            this.h1 = h2;
        }
        if (objectInput.readBoolean()) {
            final ick j2 = new ick();
            j2.readExternal(objectInput);
            this.i1 = true;
            this.j1 = j2;
        }
        this.a(objectInput.readUTF());
        this.l1 = objectInput.readInt();
        this.b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            final String utf = objectInput.readUTF();
            this.n1 = true;
            this.o1 = utf;
        }
        if (objectInput.readBoolean()) {
            final String utf2 = objectInput.readUTF();
            this.p1 = true;
            this.q1 = utf2;
        }
        if (objectInput.readBoolean()) {
            final String utf3 = objectInput.readUTF();
            this.r1 = true;
            this.s1 = utf3;
        }
        if (objectInput.readBoolean()) {
            final String utf4 = objectInput.readUTF();
            this.t1 = true;
            this.u1 = utf4;
        }
        if (objectInput.readBoolean()) {
            final String utf5 = objectInput.readUTF();
            this.v1 = true;
            this.w1 = utf5;
        }
        this.x1 = objectInput.readBoolean();
        final int int1 = objectInput.readInt();
        final int n2 = 0;
        for (int i = 0; i < int1; ++i) {
            final gck gck = new gck();
            gck.readExternal(objectInput);
            this.y1.add(gck);
        }
        for (int int2 = objectInput.readInt(), k = n2; k < int2; ++k) {
            final gck gck2 = new gck();
            gck2.readExternal(objectInput);
            this.z1.add(gck2);
        }
        this.A1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            final String utf6 = objectInput.readUTF();
            this.B1 = true;
            this.C1 = utf6;
        }
        this.D1 = objectInput.readBoolean();
        this.E1 = objectInput.readBoolean();
    }
    
    @Override
    public final void writeExternal(final ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.C0);
        if (this.C0) {
            this.D0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E0);
        if (this.E0) {
            this.F0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G0);
        if (this.G0) {
            this.H0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I0);
        if (this.I0) {
            this.J0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.K0);
        if (this.K0) {
            this.L0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.M0);
        if (this.M0) {
            this.N0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.O0);
        if (this.O0) {
            this.P0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Q0);
        if (this.Q0) {
            this.R0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.S0);
        if (this.S0) {
            this.T0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.U0);
        if (this.U0) {
            this.V0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.W0);
        if (this.W0) {
            this.X0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y0);
        if (this.Y0) {
            this.Z0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.a1);
        if (this.a1) {
            this.b1.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c1);
        if (this.c1) {
            this.d1.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.e1);
        if (this.e1) {
            this.f1.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.g1);
        if (this.g1) {
            this.h1.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i1);
        if (this.i1) {
            this.j1.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.k1);
        objectOutput.writeInt(this.l1);
        objectOutput.writeUTF(this.m1);
        objectOutput.writeBoolean(this.n1);
        if (this.n1) {
            objectOutput.writeUTF(this.o1);
        }
        objectOutput.writeBoolean(this.p1);
        if (this.p1) {
            objectOutput.writeUTF(this.q1);
        }
        objectOutput.writeBoolean(this.r1);
        if (this.r1) {
            objectOutput.writeUTF(this.s1);
        }
        objectOutput.writeBoolean(this.t1);
        if (this.t1) {
            objectOutput.writeUTF(this.u1);
        }
        objectOutput.writeBoolean(this.v1);
        if (this.v1) {
            objectOutput.writeUTF(this.w1);
        }
        objectOutput.writeBoolean(this.x1);
        final int size = this.y1.size();
        objectOutput.writeInt(size);
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            ((gck)this.y1.get(i)).writeExternal(objectOutput);
        }
        final int size2 = this.z1.size();
        objectOutput.writeInt(size2);
        for (int j = n; j < size2; ++j) {
            ((gck)this.z1.get(j)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A1);
        objectOutput.writeBoolean(this.B1);
        if (this.B1) {
            objectOutput.writeUTF(this.C1);
        }
        objectOutput.writeBoolean(this.D1);
        objectOutput.writeBoolean(this.E1);
    }
}
