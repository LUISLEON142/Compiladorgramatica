# RISC-V ASM generado por Luis

main:
  addi sp, sp, -16    # prologue
  sw   ra, 12(sp)

  sw   t0, -4(sp)
  sw   t0, -4(sp)
  beq  t0, zero, else_0
  sw   t0, -4(sp)
  j    endif_1
else_0:
  sw   t0, -4(sp)
endif_1:
loop_2:
  beq  t0, zero, endloop_3
  sw   t0, -4(sp)
  j    loop_2
endloop_3:

  lw   ra, 12(sp)
  addi sp, sp, 16
  ret

