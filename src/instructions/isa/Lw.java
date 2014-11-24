package instructions.isa;

import utilities.Utilities;
import instructions.Instruction;

public class Lw extends Instruction {

	Lw(String[] params) {
		super(params, new String[]{"regA", "regB", "imm"}, "0101");
	}

	@Override
	public void execute() {
		mem.setRegisterValue(regA, mem.getRegisterValue(regB)+immValue);
	}

	@Override
	public String getMachineCode() {
		return getOpcode() + Utilities.getBinaryNumber(getRegANum(), 3)
				+ Utilities.getBinaryNumber(getRegBNum(), 3)
				+ Utilities.getBinaryNumber(getImmValue(), 7);
	}

}