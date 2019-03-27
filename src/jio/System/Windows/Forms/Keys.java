package jio.System.Windows.Forms;

public enum Keys {
  None(0L),
  LButton(1L),
  RButton(2L),
  Cancel(3L),
  MButton(4L),
  XButton1(5L),
  XButton2(6L),
  Back(8L),
  Tab(9L),
  LineFeed(10L),
  Clear(12L),
  Enter(13L),
  ShiftKey(16L),
  ControlKey(17L),
  Menu(18L),
  Pause(19L),
  CapsLock(20L),
  HanguelMode(21L),
  JunjaMode(23L),
  FinalMode(24L),
  KanjiMode(25L),
  Escape(27L),
  IMEConvert(28L),
  IMENonconvert(29L),
  IMEAccept(30L),
  IMEModeChange(31L),
  Space(32L),
  Prior(33L),
  PageDown(34L),
  End(35L),
  Home(36L),
  Left(37L),
  Up(38L),
  Right(39L),
  Down(40L),
  Select(41L),
  Print(42L),
  Execute(43L),
  PrintScreen(44L),
  Insert(45L),
  Delete(46L),
  Help(47L),
  D0(48L),
  D1(49L),
  D2(50L),
  D3(51L),
  D4(52L),
  D5(53L),
  D6(54L),
  D7(55L),
  D8(56L),
  D9(57L),
  A(65L),
  B(66L),
  C(67L),
  D(68L),
  E(69L),
  F(70L),
  G(71L),
  H(72L),
  I(73L),
  J(74L),
  K(75L),
  L(76L),
  M(77L),
  N(78L),
  O(79L),
  P(80L),
  Q(81L),
  R(82L),
  S(83L),
  T(84L),
  U(85L),
  V(86L),
  W(87L),
  X(88L),
  Y(89L),
  Z(90L),
  LWin(91L),
  RWin(92L),
  Apps(93L),
  Sleep(95L),
  NumPad0(96L),
  NumPad1(97L),
  NumPad2(98L),
  NumPad3(99L),
  NumPad4(100L),
  NumPad5(101L),
  NumPad6(102L),
  NumPad7(103L),
  NumPad8(104L),
  NumPad9(105L),
  Multiply(106L),
  Add(107L),
  Separator(108L),
  Subtract(109L),
  Decimal(110L),
  Divide(111L),
  F1(112L),
  F2(113L),
  F3(114L),
  F4(115L),
  F5(116L),
  F6(117L),
  F7(118L),
  F8(119L),
  F9(120L),
  F10(121L),
  F11(122L),
  F12(123L),
  F13(124L),
  F14(125L),
  F15(126L),
  F16(127L),
  F17(128L),
  F18(129L),
  F19(130L),
  F20(131L),
  F21(132L),
  F22(133L),
  F23(134L),
  F24(135L),
  NumLock(144L),
  Scroll(145L),
  LShiftKey(160L),
  RShiftKey(161L),
  LControlKey(162L),
  RControlKey(163L),
  LMenu(164L),
  RMenu(165L),
  BrowserBack(166L),
  BrowserForward(167L),
  BrowserRefresh(168L),
  BrowserStop(169L),
  BrowserSearch(170L),
  BrowserFavorites(171L),
  BrowserHome(172L),
  VolumeMute(173L),
  VolumeDown(174L),
  VolumeUp(175L),
  MediaNextTrack(176L),
  MediaPreviousTrack(177L),
  MediaStop(178L),
  MediaPlayPause(179L),
  LaunchMail(180L),
  SelectMedia(181L),
  LaunchApplication1(182L),
  LaunchApplication2(183L),
  OemSemicolon(186L),
  Oemplus(187L),
  Oemcomma(188L),
  OemMinus(189L),
  OemPeriod(190L),
  Oem2(191L),
  Oemtilde(192L),
  Oem4(219L),
  OemPipe(220L),
  Oem6(221L),
  OemQuotes(222L),
  Oem8(223L),
  Oem102(226L),
  ProcessKey(229L),
  Packet(231L),
  Attn(246L),
  Crsel(247L),
  Exsel(248L),
  EraseEof(249L),
  Play(250L),
  Zoom(251L),
  NoName(252L),
  Pa1(253L),
  OemClear(254L),
  KeyCode(65535L),
  Shift(65536L),
  Control(131072L),
  Alt(262144L),
  Modifiers(-65536L),
  ;
  private long numVal;

  Keys(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
