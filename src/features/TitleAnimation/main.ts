const displayedNames: string[] = [
  "n",
  "な",
  "なg",
  "なご",
  "なごy",
  "なごや",
  "なごやk",
  "なごやこ",
  "なごやこう",
  "なごやこうg",
  "なごやこうgy",
  "なごやこうぎょ",
  "なごやこうぎょう",
  "なごやこうぎょうd",
  "なごやこうぎょうだ",
  "なごやこうぎょうだい",
  "なごやこうぎょうだいg",
  "なごやこうぎょうだいが",
  "なごやこうぎょうだいがk",
  "なごやこうぎょうだいがく",
  "名古屋工業大学\n",
  "名古屋工業大学\np",
  "名古屋工業大学\nぷ",
  "名古屋工業大学\nぷr",
  "名古屋工業大学\nぷろ",
  "名古屋工業大学\nぷろg",
  "名古屋工業大学\nぷろぐ",
  "名古屋工業大学\nぷろぐr",
  "名古屋工業大学\nぷろぐら",
  "名古屋工業大学\nぷろぐらm",
  "名古屋工業大学\nぷろぐらみ",
  "名古屋工業大学\nぷろぐらみn",
  "名古屋工業大学\nぷろぐらみん",
  "名古屋工業大学\nぷろぐらみんg",
  "名古屋工業大学\nぷろぐらみんぐ",
  "名古屋工業大学\nぷろぐらみんぐb",
  "名古屋工業大学\nぷろぐらみんぐぶ",
  "名古屋工業大学\nプログラミング部",
];

async function ClubNameAnimation(element: HTMLElement) {
  async function updateContent(i: number): Promise<void> {
    return new Promise((resolve) => {
      setTimeout(() => {
        element.innerText = displayedNames[i];
        return resolve();
      }, 70);
    });
  }
  for (let i = 0; i < displayedNames.length; i++) {
    await updateContent(i);
  }
}

export { ClubNameAnimation };
