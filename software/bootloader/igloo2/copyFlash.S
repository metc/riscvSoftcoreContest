.global crtStart

#define binarySize 0x05000
#define dstAddress 0x80000
#define srcAddress 0x30000

crtStart:
	li a0, srcAddress
	li a1, dstAddress
	li a2, dstAddress + binarySize
copyLoop:
	lw a3, 0(a0)
	sw a3, 0(a1)
	lw a3, 4(a0)
	sw a3, 4(a1)
	lw a3, 8(a0)
	sw a3, 8(a1)
	lw a3, 12(a0)
	sw a3, 12(a1)
	addi a0,a0, 16
	addi a1,a1, 16
	bne a1, a2, copyLoop
copyEnd:
    nop
    nop
    nop
    nop
    nop
    nop
    nop
	call dstAddress
