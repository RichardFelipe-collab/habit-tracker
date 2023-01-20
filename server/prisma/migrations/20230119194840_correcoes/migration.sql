/*
  Warnings:

  - You are about to drop the column `dayId` on the `DayHabit` table. All the data in the column will be lost.
  - You are about to drop the column `habitId` on the `DayHabit` table. All the data in the column will be lost.

*/
-- RedefineTables
PRAGMA foreign_keys=OFF;
CREATE TABLE "new_DayHabit" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "day_id" TEXT NOT NULL,
    "habit_id" TEXT NOT NULL,
    CONSTRAINT "DayHabit_day_id_fkey" FOREIGN KEY ("day_id") REFERENCES "days" ("id") ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT "DayHabit_habit_id_fkey" FOREIGN KEY ("habit_id") REFERENCES "habits" ("id") ON DELETE RESTRICT ON UPDATE CASCADE
);
INSERT INTO "new_DayHabit" ("day_id", "habit_id", "id") SELECT "day_id", "habit_id", "id" FROM "DayHabit";
DROP TABLE "DayHabit";
ALTER TABLE "new_DayHabit" RENAME TO "DayHabit";
CREATE UNIQUE INDEX "DayHabit_day_id_habit_id_key" ON "DayHabit"("day_id", "habit_id");
PRAGMA foreign_key_check;
PRAGMA foreign_keys=ON;
